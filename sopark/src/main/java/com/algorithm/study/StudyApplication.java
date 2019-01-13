package com.algorithm.study;

import lombok.extern.slf4j.Slf4j;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

@Slf4j
public class StudyApplication {

    public static void main(String[] args) {
        StudyApplication studyApplication = new StudyApplication();
//        studyApplication.functionD();
//        studyApplication.functionA();
        studyApplication.functionC();
        studyApplication.functionB();
    }


    // main thread 에서 fork 하여 worker 생성
    public void functionA(){
        log.info("functionA ================================================================");
        List<Integer> dealmaxList = new ArrayList<>();
        dealmaxList.add(1);
        dealmaxList.add(2);
        dealmaxList.add(3);
        dealmaxList.add(4);
        dealmaxList.add(5);
        dealmaxList.add(6);
        dealmaxList.add(7);
        dealmaxList.add(8);
        dealmaxList.parallelStream().forEach(index -> {
            log.info( "functionA :: index=" + index + ", ended at " + new Date());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) { }
        });
    }

    // main thread 에서 fork 하지 않음. get했을때 순차적으로 실행됨. 멀티 실행아님..
    public void functionB() {
        log.info("functionB ================================================================");
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                executor.submit(() -> {
                    try {
                        Thread.sleep(500);
                        log.info( "functionB :: index=" + index + ", ended at " + new Date());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }).get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }

    // thread pool 에서 스레드를 가져다가 실행. get했을때 순차적으로 실행됨. 멀티 실행아님..
    public void functionC() {
        log.info("functionC ================================================================");
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                executor.submit(() -> {
                    try {
                        Thread.sleep(500);
                        log.info( "functionC :: index=" + index + ", ended at " + new Date());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }).get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }

    // thread pool 에서 스레드를 가져다가 실행
    public void functionD(){
        log.info("functionD ================================================================");
        List<Integer> dealmaxList = new ArrayList<>();
        dealmaxList.add(1);
        dealmaxList.add(2);
        dealmaxList.add(3);
        dealmaxList.add(4);
        dealmaxList.add(5);
        dealmaxList.add(6);
        dealmaxList.add(7);
        dealmaxList.add(8);
        ForkJoinPool forkjoinPool = new ForkJoinPool(5);
        try {
            forkjoinPool.submit(() -> {
                dealmaxList.parallelStream().forEach(index -> {
                    log.info( "functionD :: index=" + index + ", ended at " + new Date());

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) { }
                });
            }).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}


package com.algorithm.study.day23;


import java.util.*;

class Solution {

    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Integer> integers = new LinkedList<>();
        for(int priority:priorities){
            integers.offer(priority);
        }
        Arrays.sort(priorities);
        int i = priorities.length - 1;
        while(!integers.isEmpty()){
            Integer poll = integers.poll();
            if(poll == priorities[i-answer]){
                answer++;
                location--;
                if(location <0)
                    break;
            }else{
                integers.offer(poll);
                location--;
                if(location < 0) {
                    location = integers.size() - 1;
                }

            }
        }


        return answer;
    }
}
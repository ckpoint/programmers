package com.algorithm.study.day29;

import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {

        Map<String, Integer> genresSumMap = new HashMap<>();
        Map<String, Queue<Integer>> genresPriorty  = new HashMap<>();
        for(int i=0;i<genres.length;i++){
            String key = genres[i];
            int play = plays[i];
            Queue<Integer> integers = null;
            if(genresSumMap.containsKey(key)) {
                Integer integer = genresSumMap.get(key);
                play+=integer;
            }
            if(genresPriorty.containsKey(key)){
                integers = genresPriorty.get(key);
            }else{
                integers = new PriorityQueue<>(Comparator.reverseOrder());
            }
            genresSumMap.put(key,play);
            integers.offer(plays[i]);
            genresPriorty.put(key,integers);

        }
        List<Integer> integers = new ArrayList<>();
        for(String key:genresSumMap.keySet()){
            integers.add(genresSumMap.get(key));
        }
        integers.sort(Comparator.reverseOrder());
        List<String> strings = new ArrayList<>();
        for(Integer integer:integers){
            for(String key:genresSumMap.keySet()){
                if(integer.equals(genresSumMap.get(key))){
                   if(strings.size()<2){
                       strings.add(key);
                   }

                }
            }
        }

        List<Integer> integerList  = new ArrayList<>();
        for(String key:strings){
            Queue<Integer> integers1 = genresPriorty.get(key);
            if(integers1.size()==1){
                if(integerList.size()<4)
                integerList.add(integers1.poll());
            }else{
                if(integerList.size()<4)
                integerList.add(integers1.poll());
                if(integerList.size()<4)
                integerList.add(integers1.poll());
            }
        }
        int anwer[] = new int[4];
        int count =0;
        for(Integer integer:integerList){
            for(int i=0;i<plays.length;i++){
                if(integer==plays[i]){
                    anwer[count++] = i;
                }
            }
        }
        return anwer;
    }
}
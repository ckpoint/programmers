package com.algorithm.study.day31;

import java.util.*;

class Solution {

    public int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> integers = new ArrayList<>();
        for(int i=0;i<progresses.length;i++){
            int percent = 100-progresses[i];
            int ceil = (int) Math.ceil((double) percent / speeds[i]);
            queue.offer(ceil);
        }
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        while (!queue.isEmpty()){
            Integer poll = queue.poll();
            integers.add(poll);

            Integer peek = queue.peek();
            if(peek!=null){
               while(poll>=peek){
                   integers.add(peek);
                   queue.poll();
                   peek = queue.peek();
                   if(peek==null){
                       break;
                   }
               }
            }
            map.put(count++,integers.size());
            integers = new ArrayList<>();

        }
        int[] answer = new int[map.size()];
        int anwserCount =0;
        for(Integer key:map.keySet()){
            answer[anwserCount++]  = map.get(key);
        }
        return answer;
    }
}
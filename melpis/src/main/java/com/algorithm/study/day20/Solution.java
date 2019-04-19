package com.algorithm.study.day20;


import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(String[] operations) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(String operation:operations){
            String[] split = operation.split("\\s+");
            int e = Integer.parseInt(split[1]);
            if("I".equalsIgnoreCase(split[0])){
                minHeap.offer(e);
                maxHeap.offer(e);
            }else{
                if(e > 0 ){
                    maxHeap.poll();
                }else{
                    Integer peek = maxHeap.peek();
                    minHeap.remove(peek);
                    minHeap.poll();
                }


            }
        }
        if(maxHeap.size()==0 ||minHeap.size()==0){
            return new int[]{0,0};
        }
        int max =  maxHeap.peek()==null?0:maxHeap.peek();
        int min =  minHeap.peek()==null?0:minHeap.peek();

        return new int[]{max, min};
    }
}
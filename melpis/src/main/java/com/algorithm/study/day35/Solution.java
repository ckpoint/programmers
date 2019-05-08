package com.algorithm.study.day35;


import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        Deque<Integer> deque = new LinkedList<>();
        for(int p:people){
            deque.push(p);
        }

        while(!deque.isEmpty()){
            answer++;
            int first = deque.pollFirst();
            if(!deque.isEmpty() && first+deque.peekLast() <= limit){
                deque.pollLast();
            }
        }

        return answer;
    }

}

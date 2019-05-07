package com.algorithm.study.day30;

import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Stack<Integer> truckStack = new Stack<>();
        Map<Integer, Integer> bridgeMap = new HashMap<>();

        for (int i = truck_weights.length-1; i >= 0; i--) {
            truckStack.push(truck_weights[i]);
        }

        int answer = 0;

        while(true) {
            int sum = 0 ;
            answer++;
            bridgeMap.remove(answer);
            for(int value:bridgeMap.values()){
                sum+= value;
            }

            if (!truckStack.isEmpty()) {
                if (sum + truckStack.peek() <= weight) {
                    bridgeMap.put(answer + bridge_length, truckStack.pop());
                }
            }
            if (bridgeMap.isEmpty() && truckStack.isEmpty()) {
                break;
            }

        }
        return answer;
    }
}
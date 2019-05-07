package com.algorithm.study.day31;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        for(int i=0;i<progresses.length;i++){
            int percent = 100-progresses[i];
           // System.out.println(percent);
            System.out.println(Math.ceil(percent/speeds[i]));
        }
        return answer;
    }
}
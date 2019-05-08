package com.algorithm.study.day32;

import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int value:d){
            budget-=value;
            if(budget<0){
                break;
            }
            answer++;
        }

        return answer;
    }
}
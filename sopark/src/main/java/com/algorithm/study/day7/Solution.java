package com.algorithm.study.day7;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    Set<Integer> resultSet = new HashSet<>();

    public int solution(int[] weight) {
        int answer = 0;

        if(weight.length == 1){
            return weight[0] + 1;
        }

        int max = weight[0];
        int min = weight[0];

        for(int index = 0 ; index < weight.length ; index ++){
            resultSet.add(weight[index]);
            int inputValue = weight[index];
            int innerIndex = index + 1;
            while (true) {
                int value = inputValue + weight[innerIndex];
                resultSet.add(value);
                max = value > max ? value : max;
                min = value < min ? value : min;
            }
        }

        for(int index = min ; index < max ; index ++){
            if(!resultSet.contains(index)){
                answer = index;
                break;
            }
        }

        if(answer == 0) {
            return max + 1;
        }

        return answer;
    }
}


// 3, 1, 6, 2, 7, 30, 1
// 1, 1, 2, 3, 6, 7, 30
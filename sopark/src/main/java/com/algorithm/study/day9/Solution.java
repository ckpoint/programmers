package com.algorithm.study.day9;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0 ; i < commands.length ; i++) {
            int startIdx = commands[i][0] -1;
            int endIdx = commands[i][1] - 1;
            int selectIdx = commands[i][2] - 1;

            int[] newArr = new int[endIdx - startIdx + 1];
            for(int j = 0; startIdx <= endIdx ; startIdx ++){
                newArr[j] = array[startIdx];
                j++;
            }

            Arrays.sort(newArr);
            answer[i] = newArr[selectIdx];
        }

        return answer;
    }
}

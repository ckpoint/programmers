package com.algorithm.study.day8;


import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
        int count =0;
        for(int[] command:commands){
            int [] arrays = Arrays.copyOfRange(array, command[0]-1, command[1]);
            Arrays.sort(arrays);
            answer[count++] = arrays[command[2]-1];
        }
        return answer;
    }

}

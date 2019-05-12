package com.algorithm.study.day18;

public class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] result = new int[arr1.length][arr1[0].length];

        for(int i =0 ; i < arr1.length ; i++ ){
            for (int k =0 ; k < arr1[i].length ; k++) {
                result[i][k] = arr1[i][k] + arr2[i][k];
            }
        }

        return result;
    }
}

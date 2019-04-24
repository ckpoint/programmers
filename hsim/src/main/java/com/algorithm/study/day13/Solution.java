package com.algorithm.study.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[][] solution(int[] numbers, int k) {

        List<int[]> res = new ArrayList<>();

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] - numbers[i] == k) {
                    res.add(new int[]{numbers[i], numbers[j]});
                    break;
                } else if (numbers[j] - numbers[i] > k) {
                    break;
                }
            }
        }


        return res.toArray(new int[0][2]);
    }
}

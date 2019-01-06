package com.algorithm.study.day7;

import java.util.Arrays;

public class Solution {

    public int solution(int[] weight) {
        Arrays.sort(weight);
        int sum = 0;
        for (int w : weight) {
            if ((sum + 1) < w) {
                return sum + 1;
            }
            sum += w;
        }
        return Arrays.stream(weight).sum() + 1;

    }

}


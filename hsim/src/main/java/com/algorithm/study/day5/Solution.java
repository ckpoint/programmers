package com.algorithm.study.day5;

import java.util.stream.LongStream;

public class Solution {

    public long solution(int a, int b) {
        if (a == b) {
            return a;
        }

        int max = a > b ? a : b;
        int min = a < b ? a : b;

        return LongStream.range(min, max + 1).sum();

    }
}

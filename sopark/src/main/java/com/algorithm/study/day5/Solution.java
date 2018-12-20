package com.algorithm.study.day5;

import java.util.stream.IntStream;

public class Solution {
    public long solution(int a, int b) {
        if(a == b){
            return a;
        }

        IntStream intStream = a < b ? IntStream.rangeClosed(a, b) : IntStream.rangeClosed(b, a);

        return intStream
                .mapToLong(Long::valueOf)
                .sum();
    }
}

package com.algorithm.study.day4;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    public String solution(int n) {
        return IntStream.range(0, n).mapToObj(i -> i % 2 == 0 ? "수" : "박").collect(Collectors.joining());
    }
}

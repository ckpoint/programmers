package com.algorithm.study.day9;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public String solution(int[] numbers) {
        String value = Arrays.stream(numbers).mapToObj(String::valueOf)
                .sorted((o1, o2) -> (o2 + o1).compareTo(o1 + o2))
                .collect(Collectors.joining(""));

        String zeroString = IntStream.range(0, value.length()).mapToObj(zero -> "0").collect(Collectors.joining(""));
        if(value.equals(zeroString)){
            return "0";
        }

        return value;
    }
}

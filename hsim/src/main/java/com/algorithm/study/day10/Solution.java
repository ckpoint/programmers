package com.algorithm.study.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public String solution(int[] numbers) {

        List<String> stringList = Arrays.stream(numbers).mapToObj(num -> num +"")
                .sorted((a, b) -> a.compareTo(b) * -1)
                .sorted((a,b) -> Integer.valueOf(a+b) >= Integer.valueOf(b+a) ?-1 : 1)
                .collect(Collectors.toList());


        String result = stringList.stream().collect(Collectors.joining());
        if ( result.startsWith("0")){
            return "0";
        }
        return result;
    }
}

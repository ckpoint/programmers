package com.algorithm.study.day17;


import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(int[] numbers) {
        String answer;
        Integer[] integers = Arrays.stream(numbers)
                .boxed()
                .toArray(Integer[]::new);
        Arrays.sort(integers, (o1, o2) ->{
            String s1 = o1.toString();
            String s2 = o2.toString();
            return -Integer.compare(Integer.parseInt(s1 + s2), Integer.parseInt(s2 + s1));
        });
        answer = Arrays.stream(integers).map(String::valueOf).collect(Collectors.joining(""));
        if(answer.charAt(0) == '0') {
            return "0";
        }else {
            return answer;
        }
    }
}
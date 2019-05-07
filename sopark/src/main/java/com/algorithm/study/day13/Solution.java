package com.algorithm.study.day13;

public class Solution {
    public int solution(int n) {
        // 문자열에서 아스키코드값 48을 빼야 정수가 나옴.
        return String.valueOf(n).chars().map(operand -> operand - 48).sum();
    }
}

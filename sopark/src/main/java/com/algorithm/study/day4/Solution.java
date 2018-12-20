package com.algorithm.study.day4;

public class Solution {
    private final String ODD_STRING = "수";
    private final String EVEN_STRING = "박";

    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1 ; i <= n ; i++) {
            if(i % 2 == 0){
                answer.append(EVEN_STRING);
            }else {
                answer.append(ODD_STRING);
            }
        }

        return answer.toString();
    }
}

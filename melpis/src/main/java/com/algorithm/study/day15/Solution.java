package com.algorithm.study.day15;



class Solution {
    public String solution(int a, int b) {
        String[] week = {"THU", "FRI", "SAT", "SUN","MON", "TUE", "WED"};
        int[] day = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int sumDay = b;
        for(int i=0;i<a-1;i++){
            sumDay+= day[i];
        }
        return week[sumDay % 7];
    }
}
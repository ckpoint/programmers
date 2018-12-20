package com.algorithm.study.day5;

public class SolutionDay5 {
    public long solution(int a, int b) {
        long answer = 0;
        if(a==b){
            return a;
        }else{
            int max = a>b?a:b;
            int min = a<b?a:b;
            for(int i=min;i<=max;i++){
                answer+=i;
            }

        }
        return answer;
    }
    public long solution2(int a, int b) {
        return  Long.valueOf((Math.abs(a-b)+1)*(a+b)/2);
    }
}

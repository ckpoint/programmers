package com.algorithm.study.day2;

public class SolutionDay2 {
    public long solution(long number){
        long i = number / 3;
        String anwer="";
        String tail;
        if(number%3==1){
            tail="1";
        }else if(number%3==2){
            tail="2";
        }else{
            i = i-1;
            tail="4";
        }
        if(i > 0){
            anwer = Long.toString(solution(i));
        }

        return Long.valueOf(anwer+tail);
    }
}

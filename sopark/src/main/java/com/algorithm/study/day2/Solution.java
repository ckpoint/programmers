package com.algorithm.study.day2;

public class Solution {

    private static int DIVIDE_NUM = 3;
    private static int REPLACE_NUM = 4;

    public String solution(int n){
        return String.valueOf(getNumber(n));
    }

    private long getNumber(long n) {
        if(n <= DIVIDE_NUM) {
            return n == 3 ? REPLACE_NUM : n;
        }

        long remain = n % DIVIDE_NUM;
        long mok;

        if(remain == 0) {
            mok = (n - 1) / DIVIDE_NUM;
            remain = 4;
        }else{
            mok = n / DIVIDE_NUM;
        }

        if(mok >= DIVIDE_NUM){
            mok = getNumber(mok);
        }

        mok *=  10;

        return remain + mok;
    }
}

package com.algorithm.study.day2;

public class Solution {

    int num;

    public String solution(int n) {

        this.num = n;
        StringBuilder result = new StringBuilder();


        for (; num > 0; num = num / 3) {
            result.append(getAppendStr());
        }

        return result.reverse().toString().replaceAll("0", "1");
    }

    private String getAppendStr() {

        int remainder = num % 3;
        System.out.println(" n :  " + num + " , remainder : " + remainder);

        switch (remainder) {
            case 1 % 3:
                return "1";
            case 2 % 3:
                return "2";
            case 3 % 3:
                num--;
                return "4";
        }
        return "";
    }
}

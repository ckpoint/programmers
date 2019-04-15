package com.algorithm.study.day16;



class Solution {
    public String solution(String s) {
        String answer = "";
        int length =s.length()/2;
        int oe =s.length()%2;
       if(oe == 0){
           String s1 = Character.toString(s.charAt(length - 1));
           String s2 = Character.toString(s.charAt(length));
           answer =s1+s2;
       }else{
           answer = String.valueOf(s.charAt(length));
       }

        return answer;
    }
}
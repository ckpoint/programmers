package com.algorithm.study.day27;


import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String numbers) {
        int answer  = 0;
        Set<Integer> hashSet = new HashSet<>();
        permutation("",numbers, hashSet);
        for(int number:hashSet){
                boolean isPrime = true;
                for(int i=2;i<number;i++){
                    if(number%i==0) {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    answer++;
                }


        }
        return answer;
    }
    private static void permutation(String prefix, String str, Set<Integer> integers) {
        int n = str.length();
        if(!"".equalsIgnoreCase(prefix)) {
            int e = Integer.parseInt(prefix);
            if(e!=0  && e!=1){
                integers.add(e);

            }
        }
        for (int i = 0; i < n; i++) {
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), integers);
        }

    }
}
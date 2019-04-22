package com.algorithm.study.day21;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array, int k) {
        int count =0;
        Arrays.sort(array);
        for(int a:array){
            for(int b:array){
                if(a-k==b){
                    count++;
                }
            }
        }
     return count;
    }
    public int solution2(int[] array, int k) {
        int count =0;
        Arrays.sort(array);
        for(int a:array){
            int i = Arrays.binarySearch(array, a + k);
           if(i>0){
               count++;
           }
        }
        return count;
    }
    public int solution3(int[] array, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int a:array){
            map.put(a,a);
        }
        for(int key:map.keySet()){
            if(map.containsKey(key+k)){
                count++;
            }
        }

        return count;
    }
}
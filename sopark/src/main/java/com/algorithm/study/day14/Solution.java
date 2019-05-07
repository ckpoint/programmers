package com.algorithm.study.day14;

import java.util.LinkedList;
import java.util.List;

public class Solution {


    public int[] solution(int []arr) {
        Integer cacheValue = arr[0];
        List<Integer> result = new LinkedList<>();
        result.add(cacheValue);
        for(int i = 1 ; i < arr.length ; i++) {
            int value = arr[i];
            if(value != cacheValue){
                cacheValue = value;
                result.add(value);
            }
        }

        return result.stream().mapToInt(i->i).toArray();
    }
}

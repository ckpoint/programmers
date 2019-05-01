package com.algorithm.study.day12;

import java.util.*;
import java.util.stream.IntStream;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] mergedArray = merge(n, lost, reserve);

        int count = 0;
        for(int i = 0 ; i < mergedArray.length ; i++) {
            if(mergedArray[i] > 0){
                count += 1;
                continue;
            }

            if(i != 0 && mergedArray[i -1] > 1) {
                count += 1;
                mergedArray[i -1]--;
            }else if(i != mergedArray.length-1 && mergedArray[i + 1] > 1) {
                mergedArray[i+1]--;
                count += 1;
            }
        }

        return count;
    }

    public int[] merge(int n , int[] lost, int[] reserve) {
        int[] merge = IntStream.range(0, n).map(operand -> 1).toArray();

        if(lost.length != 0) Arrays.stream(lost).forEach(value -> merge[value-1]--);
        if(reserve.length != 0) Arrays.stream(reserve).forEach(value -> merge[value-1]++);
        return merge;
    }
}

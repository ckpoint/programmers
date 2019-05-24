package com.algorithm.study.day21;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public List<Integer> solution(List<Integer> inputData, List<Integer> rotation){
        List<Integer> result = new ArrayList<>();
        int max = Collections.max(inputData);
        int maxIndex = inputData.indexOf(max);
        for(int index : rotation) {
            int rotationCount = index % inputData.size() ;
            if(rotationCount == 0) {
                result.add(maxIndex);
                continue;
            }
            int diff = maxIndex - rotationCount;

            if(diff >= 0) {
                result.add(diff);
            }else {
                result.add(inputData.size() + diff);
            }
        }

        return result;
    }


}

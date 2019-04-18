package com.algorithm.study.day10;

import sun.awt.image.ImageWatched;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class Solution {
    int CACHE_MISS_SECOND = 5;
    int CACHE_SUCCESS_SECOND = 1;

    public int solution(int cacheSize, String[] cities) {

        if(cacheSize == 0){
            return CACHE_MISS_SECOND * cities.length;
        }

        LinkedList<String> cacheStore = new LinkedList<>();
        return Arrays.stream(cities).mapToInt(value -> {
            String lowCaseValue = value.toLowerCase();

            int findIndex = cacheStore.lastIndexOf(lowCaseValue);

            if(cacheStore.size() == cacheSize){
                cacheStore.removeFirst();
            }

            cacheStore.add(lowCaseValue);

            if(findIndex < 0) {
                return CACHE_MISS_SECOND;
            }else {
                return CACHE_SUCCESS_SECOND;
            }
        }).sum();
    }
}

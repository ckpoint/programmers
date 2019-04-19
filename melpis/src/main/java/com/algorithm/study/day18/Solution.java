package com.algorithm.study.day18;


import java.util.Arrays;
import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> linkedList = new LinkedList();
        for (String city : cities) {
            boolean isHit = false;
            int index = 0;
            for (int i = 0; i < linkedList.size(); i++) {
                String cache = linkedList.get(i);
                if (cache.equalsIgnoreCase(city)) {
                    index = i;
                    isHit = true;
                    break;
                }
            }
            if (isHit) {
                answer+=1;
                linkedList.remove(index);
            }else{
                answer+=5;
            }
            if(cacheSize != 0) {
                if (linkedList.size() == cacheSize) {
                    linkedList.removeFirst();
                }

                linkedList.add(city);
            }
        }

        return answer;
    }

    int CACHE_MISS_SECOND = 5;
    int CACHE_SUCCESS_SECOND = 1;

    public int solution2(int cacheSize, String[] cities) {

        if(cacheSize == 0){
            return CACHE_MISS_SECOND * cities.length;
        }

        LinkedList<String> cacheStore = new LinkedList<>();

        return Arrays.stream(cities).mapToInt(value -> {
            String lowCaseValue = value.toLowerCase();
            boolean isFind = cacheStore.contains(lowCaseValue);
            if(isFind){
                cacheStore.remove(lowCaseValue);
            }

            if(cacheStore.size() == cacheSize){
                cacheStore.removeFirst();
            }

            cacheStore.add(lowCaseValue);

            if(isFind) {
                return CACHE_SUCCESS_SECOND;
            }else {
                return CACHE_MISS_SECOND;
            }
        }).sum();
    }
}
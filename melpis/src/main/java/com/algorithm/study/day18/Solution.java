package com.algorithm.study.day18;


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
}
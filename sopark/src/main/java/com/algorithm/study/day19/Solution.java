package com.algorithm.study.day19;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        Arrays.stream(participant).forEach(s -> {
            Integer count = map.get(s);
            if (count == null) {
                map.put(s, 0);
            } else {
                map.put(s, ++count);
            }
        });

        Arrays.stream(completion).forEach(s -> {
            Integer count = map.get(s);
                map.put(s, --count);
        });

        for (String key : map.keySet()) {
            if(map.get(key) == 0){
                return key;
            }
        }

        return null;
    }
}

package com.algorithm.study.day1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String anwer = "";
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String key : completion) {
            Integer value = map.containsKey(key) ? map.get(key) : new Integer(0);
            map.put(key, value + 1);
        }

        for (String key : participant) {
            Integer value = map.containsKey(key) ? map.get(key) : null;
            if (value == null || value == 0) {
                anwer = key;
            } else {
                map.put(key, value - 1);
            }
        }

        return anwer;
    }
}

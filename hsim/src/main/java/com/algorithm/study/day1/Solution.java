package com.algorithm.study.day1;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    Map<String, Integer> map = new HashMap<String, Integer>();

    public String solution(String[] participant, String[] completion) {
        assert participant.length - completion.length == 1;

        for (String s : completion) {
            Integer val = map.get(s);
            if (val == null) {
                val = new Integer(0);
            }
            map.put(s, ++val);
        }

        for (String s : participant) {
           Integer val = map.get(s) ;
           if(val == null || val < 1){
               return s;
           }
           map.put(s, --val);
        }

        return null;
    }
}

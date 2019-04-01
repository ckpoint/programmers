package com.algorithm.study.day10;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean solution(String[] phone_book) {
        Map<String,Integer> hashMap = new HashMap<>();
        for(String phone:phone_book){
            if(hashMap.containsKey(phone)){
                return false;
            }
            hashMap.put(phone,0);
            for(String key:hashMap.keySet()){
                if(!phone.equalsIgnoreCase(key)){
                    int keyLength = key.length();
                    int phoneLength = phone.length();
                    if(keyLength > phoneLength){
                        String substring = key.substring(0, phoneLength);
                        if(substring.equalsIgnoreCase(phone)){
                            return false;
                        }
                    }else {
                        String substring = phone.substring(0, keyLength);
                        if (substring.equalsIgnoreCase(key)) {
                            return false;
                        }
                    }

                }
            }
        }

       return true;
    }
}
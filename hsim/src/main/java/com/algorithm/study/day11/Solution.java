package com.algorithm.study.day11;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        Cache cache = new Cache(cacheSize);

        for (String city : cities) {
            answer += cache.findCache(city.toLowerCase().trim()) != null ? 1 : 5;
            cache.putCache(city.toLowerCase().trim());
        }

        System.out.println("answer : " + answer);

        return answer;
    }

}

class Cache {
    private List<String> stack;
    private int size;

    public Cache(int size) {
        this.size = size;
        this.stack = new ArrayList<>();
    }

    public void putCache(String city) {
        if (size < 1) {
            return;
        }

        for (int i = 0; i < stack.size(); i++) {
            if (stack.get(i).equalsIgnoreCase(city)) {
                stack.remove(i);
                i--;
            }
        }

        stack.add(city);
    }

    public String findCache(String city) {

        if (size < 1) {
            return null;
        }

        for (int i = 0; i < size; i++) {
            if (this.stack.size() <= i) {
                return null;
            }
            if (this.stack.get(this.stack.size() - 1 - i).equalsIgnoreCase(city)) {
                return city;
            }
        }

        return null;
    }
}

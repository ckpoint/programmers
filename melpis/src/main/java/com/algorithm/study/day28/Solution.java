package com.algorithm.study.day28;

import java.util.PriorityQueue;

class Solution {
    public int makeScovile(int smaller, int bigger) {
        return smaller + bigger * 2;
    }

    public int solution(int[] scovile, int K) {
        int answer = 0;
        int mixScovile = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : scovile) {
            pq.add(i);
        }
        while (pq.size() > 1) {
            mixScovile = pq.poll();
            pq.add(makeScovile(mixScovile, pq.poll()));
            answer++;
            if (pq.peek() >= K) return answer;
        }
        return pq.peek() >= K ? answer : -1;
    }
}
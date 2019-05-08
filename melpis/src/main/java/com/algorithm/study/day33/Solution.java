package com.algorithm.study.day33;


import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;

        PriorityQueue<Integer> pqSupplies = new PriorityQueue<>(Comparator.reverseOrder());
        int index = 0;

        for (int day=0; day<k; day++) {
            if (index < dates.length && day >= dates[index]) {
                pqSupplies.add(supplies[index++]);
            }
            if (stock <= 0) {
                stock += pqSupplies.remove();
                answer++;
            }

            stock--;
        }

        return answer;
    }
}
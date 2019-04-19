package com.algorithm.study.day19;


import java.util.Arrays;

class Solution {
    public long solution(long n, int[] times) {
        Arrays.sort(times);
        long max = times[times.length - 1] * n;
        long answer = max;
        long min = 0;
        long mid;

        while (max > min+1) {
            long sum = 0;
            mid = (max + min) / 2;
            for (int i = 0; i < times.length; i++) {
                sum += mid / times[i];
            }
            if (sum < n) {
                min = mid;
            } else {
                max = mid;
                answer = Math.min(answer, mid);
            }
        }

        return answer;
    }
}
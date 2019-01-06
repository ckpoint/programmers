package com.algorithm.study.day7;

import java.util.Arrays;


public class Solution {
    public int solution(int[] weight) {
        Arrays.sort(weight);
        int ans = 1;
        for (int e : weight) {
            if (ans < e)
                break;
            ans += e;
        }
        return ans;
    }

}

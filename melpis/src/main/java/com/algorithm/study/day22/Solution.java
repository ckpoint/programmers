package com.algorithm.study.day22;


class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, 0, 0, target);
    }
    int dfs(int[] numbers, int n, int sum, int target) {
        if(n == numbers.length) {
            if(sum == target) {
                return 1;
            }
            return 0;
        }
        int dfs = dfs(numbers, n + 1, sum + numbers[n], target);
        int dfs1 = dfs(numbers, n + 1, sum - numbers[n], target);
        return dfs + dfs1;
    }
}
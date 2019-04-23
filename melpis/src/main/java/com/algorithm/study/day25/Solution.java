package com.algorithm.study.day25;


import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int indexI=0;indexI<nums.length;indexI++){
            for(int indexJ=indexI+1;indexJ<nums.length;indexJ++){
                if(target==(nums[indexI]+nums[indexJ])){
                    return new int[]{indexI,indexJ};
                }
            }
        }

        return new int[]{0,0};
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
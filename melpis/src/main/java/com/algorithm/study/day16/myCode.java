package com.algorithm.study.day16;

import java.io.*;
import java.util.*;




/*
문제 설명
Problem Statement
You have several sticks of different lengths, and a stick case of a fixed length.

We want to find 2 sticks that just fit in the case.

*Please describe algorithm complexity as comment.

Input
[L1] [L2] ... [LN]
[target]
The first line of input contains a list of integers separated by a whitespace. This list represents the lengths of the sticks.

The second line of input contains an integer target. This integer represents the length of the case.

Output
Output a pair of lengths whose sum is equal to target.

[La] [Lb]
Output should be ordered in ascending order. (e.g. 1 2 is acceptable. 2 1 is not)

If you find 2 or more pairs, output the pair which contains the stick of the shortest length. (e.g. If the target is 5, and you find both 1 4 and 2 3, output 1 4)

In case there is no such pairs, output a single -1

-1
Input Example
1 2 3 4 5
6
Output Example
1 5
 */
class myCode {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sticks = br.readLine();
        String[] split = sticks.split("\\s+");
        Integer target = Integer.parseInt(br.readLine());
        int[] nums = Arrays.stream(split).sorted().mapToInt(Integer::parseInt).toArray();
        boolean isFind = false;
        for (int i = 0; i < nums.length; i++) {
            int targetTemp = target;
            targetTemp -= nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (targetTemp - nums[j] == 0) {
                    System.out.println(nums[i] + " " + nums[j]);
                    isFind = true;
                    break;
                }
                if (isFind) break;
            }
        }
        if (!isFind) System.out.println("-1");
    }
    private void test() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sticks = br.readLine();
        String[] split = sticks.split("\\s+");
        Integer target = Integer.parseInt(br.readLine());
        Map<Integer, Integer> objectObjectSortedMap = new TreeMap<>(Comparator.naturalOrder());
        for(String s:split){
            objectObjectSortedMap.put(Integer.parseInt(s),Integer.parseInt(s));
       }
       for(Integer integer:objectObjectSortedMap.keySet()) {
           if(objectObjectSortedMap.containsKey(integer+target)){
               System.out.println(integer +" "+ objectObjectSortedMap.get(integer+target));
               return;
           }
       }
        System.out.println("-1");
    }
}
package com.algorithm.study.day13;

import java.util.*;

public class Solution {
	public int[] solution(int []arr) {
        List<Integer> answerList  = new ArrayList<>();
        int temp = arr[0];
        answerList.add(arr[0]);
       
        for(int a:arr){
            if(temp!=a){
                answerList.add(a);
                temp = a;    
            }
        }
        int[] answer = new int[answerList.size()];
        int count  = 0;
        for(Integer a:answerList){
            answer[count++] = a;
        }
        return answer;
	}
}
package com.algorithm.study.day14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        HashSet<Integer> arrayList = new HashSet<>();
        for(int res:reserve){
            arrayList.add(res);
        }
        for(int i =0;i<lost.length;i++) {
            if(arrayList.contains(lost[i])) {
                answer++;
                arrayList.remove(lost[i]);
                lost[i]=-1;
            }
        }


        for(int los:lost){
            Integer temp = 0;
            boolean isRemove = false;
            for(int res:arrayList){
                if(res-1 == los || res+1 == los){
                    answer++;
                    temp = res;
                    isRemove = true;
                    break;
                }
            }
            if(isRemove) arrayList.remove(temp);
        }
        return answer;
    }
}
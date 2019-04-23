package com.algorithm.study.day24;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);
        int cnt=0;
        int cnt2=0;
        List<Integer> integers = new ArrayList<>();
        for(int i=0;i<binaryString.length();i++){
            char c = binaryString.charAt(i);
            if( c =='1'){
                cnt++;
                if(cnt==2){
                    cnt=1;
                    integers.add(cnt2);
                    cnt2=0;
                }
            }else{
                if(cnt ==1){
                    cnt2++;
                }

            }
        }
        Collections.sort(integers, Collections.reverseOrder());
        return integers.size()==0?0:integers.get(0);
    }
}
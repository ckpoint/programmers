package com.algorithm.study.day1;

import java.util.Arrays;

public class Solution {

    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        if(completion.length == 0 ){
            return "";
        }

        Integer findIndex = null;
        for (int i = 0 ; i < completion.length ; i++ ){
            if(!participant[i].equals(completion[i])){
                findIndex = i;
                break;
            }
        }

        if(findIndex == null){
            return participant[participant.length - 1];
        }

        return participant[findIndex];
    }
}

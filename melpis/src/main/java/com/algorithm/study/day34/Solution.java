package com.algorithm.study.day34;


import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int cnt = 0;
        Map<String,String> map = new HashMap<>();
        String tempword = words[0];
        map.put(tempword,tempword);
        for (int i=1;i<words.length;i++) {
            String substring = tempword.substring(tempword.length() - 1);
            System.out.println(substring);
            String word = words[i];
            if(map.containsKey(word)){
                cnt = i;
                break;
            }else{
                map.put(word,word);
            }

            String substring1 = word.substring(0,1);
            if(!substring.equals(substring1)){
                cnt = i;
                break;
            }else{
                tempword = word;
            }
        }
        if(cnt == 0){
            return new int[]{0,0};
        }
        answer[0] = cnt % n + 1;
        answer[1] = (cnt / n + 1) ;
        return answer;
    }
}

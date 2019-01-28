package com.algorithm.study.day9;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[][] baseball) {
        List<String> integers = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    String istr = String.valueOf(i);
                    String jstr = String.valueOf(j);
                    String kstr = String.valueOf(k);
                    if (!istr.equalsIgnoreCase(jstr) && !istr.equalsIgnoreCase(kstr) && !jstr.equalsIgnoreCase(kstr)) {
                        integers.add(istr + jstr + kstr);
                    }

                }
            }
        }

        List<String> answers = new ArrayList<>();
        for (int[] rows : baseball) {
            int answer = rows[0];
            String answerStr = String.valueOf(answer);
            int strike = rows[1];
            int ball = rows[2];
            answers = getAnswerOption(answers.size() == 0 ? integers : answers, answerStr, strike, ball);
        }

        return answers.size();
    }

    private List<String> getAnswerOption(List<String> answers, String answerStr, int strike, int ball) {
        List<String> answer = new ArrayList<>();
        for (String str : answers) {
            int strCount = 0;
            int ballCount = 0;
            for (int i = 0; i < str.length(); i++) {
                String s = String.valueOf(str.charAt(i));
                for (int j = 0; j < answerStr.length(); j++) {
                    String s1 = String.valueOf(answerStr.charAt(j));
                    if (s.equalsIgnoreCase(s1)) {
                        if (i == j) {
                            strCount++;
                        } else {
                            ballCount++;
                        }
                    }
                }
            }
            if (strCount == strike && ballCount == ball) {
                answer.add(str);
            }
        }
        return answer;
    }
}
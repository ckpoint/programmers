package com.algorithm.study.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public int solution(int[][] baseball) {
        int answer = 0;

        List<QNA> qna = Arrays.stream(baseball).map(QNA::new).collect(Collectors.toList());

        return answer;
    }

    class QNA {
        private int[] questions = new int[3];
        private int stlike;
        private int ball;

        QNA(int[] qna) {
            this.questions[0] = qna[0] / 100;
            this.questions[1] = (qna[0] % 100) / 10;
            this.questions[2] = (qna[0] % 10);

            this.stlike = qna[1];
            this.ball = qna[2];
        }

        public boolean isOut() {
            return this.stlike < 1 && this.ball < 1;
        }
    }
}

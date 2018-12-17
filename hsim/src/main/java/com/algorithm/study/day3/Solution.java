package com.algorithm.study.day3;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private static final int[][] PATTERN = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

    public int[] solution(int[] answers) {

        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < PATTERN.length; i++) {
            studentList.add(new Student(i + 1, PATTERN[i]).updateAnswers(answers));
        }

        int max = studentList.stream().mapToInt(st -> st.getScore()).max().getAsInt();

        return studentList.stream().filter(st -> st.getScore() == max).mapToInt(st -> st.getId()).toArray();
    }

    class Student {
        int id;
        int score;
        int pattern[];

        public Student(int id, int[] pattern) {
            this.id = id;
            this.pattern = pattern;
        }

        public Student updateAnswers(int[] answers) {
            this.score = 0;
            for (int i = 0; i < answers.length; i++) {
                score += answers[i] == pattern[i % (pattern.length )] ? 1 : 0;
            }
            return this;
        }

        public int getId() {
            return this.id;
        }

        public int getScore() {
            return this.score;
        }
    }
}

package com.algorithm.study.day3;

import java.util.ArrayList;

class SolutionDay3 {
    private int answer1Count;
    private int answer2Count;
    private int answer3Count;

    public int[] solution(int[] answers) {
        if(answers.length<1){
            return answers;
        }
        int[] answer1Array ={5, 1, 2, 3, 4};
        int[] answer2Array ={5, 2, 1, 2, 3, 2, 4, 2};
        int[] answer3Array ={5, 3, 3, 1, 1, 2, 2, 4, 4, 5};
        int answer1=0;
        int answer2=0;
        int answer3=0;
        for (int indexI = 0; indexI < answers.length; indexI++) {
            if(answer1Array[(indexI + 1) % answer1Array.length] == answers[indexI] ){
                answer1++;
            }
            if(answer2Array[(indexI + 1) % answer2Array.length] == answers[indexI] ){
                answer2++;
            }
            if(answer3Array[(indexI + 1) % answer3Array.length] == answers[indexI] ){
                answer3++;
            }
        }
        int[] answerCount = {answer1, answer2, answer3};
        int[] answerTemp = new int[3];
        int max = (answer1 >= answer2) ? (answer1 >= answer3)?answer1:answer3 : (answer2 >= answer3)?answer2:answer3;
        int count=0;
        for(int i=0;i<answerCount.length;i++){
            if(max == answerCount[i]){
                answerTemp[count++] = i+1;
            }
        }
        int[] answer = new int[count];
        System.arraycopy(answerTemp, 0, answer, 0, count);

        answer1Count = answer1;
        answer2Count = answer2;
        answer3Count = answer3;

        return answer;
    }

    public int getAnswer1Count() {
        return answer1Count;
    }

    public int getAnswer2Count() {
        return answer2Count;
    }

    public int getAnswer3Count() {
        return answer3Count;
    }
}
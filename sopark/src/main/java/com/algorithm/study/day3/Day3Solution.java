package com.algorithm.study.day3;

import java.util.*;

public class Day3Solution {

    private final static int[] PERSON1_SOLUTION = {1, 2, 3, 4, 5};
    private final static int[] PERSON2_SOLUTION = {2, 1, 2, 3, 2, 4, 2, 5};
    private final static int[] PERSON3_SOLUTION = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    private Map<Integer, Integer> personRightAnswer = new HashMap<>();

    public Day3Solution() {
        personRightAnswer.put(1, 0);
        personRightAnswer.put(2, 0);
        personRightAnswer.put(3, 0);
    }

    public int[] solution(int[] answers) {

        int answerLength = answers.length;
        for (int i = 0 ; i < answerLength ; i++){
            int answer = answers[i];
            addRightAnswerListIfRightAnswer(PERSON1_SOLUTION[i % (PERSON1_SOLUTION.length)], answer, 1);
            addRightAnswerListIfRightAnswer(PERSON2_SOLUTION[i % (PERSON2_SOLUTION.length)], answer, 2);
            addRightAnswerListIfRightAnswer(PERSON3_SOLUTION[i % (PERSON3_SOLUTION.length)], answer, 3);
        }

        // 오름차순
        int maxCount = 0;

        for(Integer personNumber : personRightAnswer.keySet()){
            Integer count = personRightAnswer.get(personNumber);

            if(count > maxCount){
                maxCount = count;
            }
        }

        List<Integer> maxCountPerson = new ArrayList<>();
        for(Integer personNumber : personRightAnswer.keySet()){
            Integer count = personRightAnswer.get(personNumber);

            if(count ==0) continue;

            if(maxCount == count){
                maxCountPerson.add(personNumber);
            }
        }

        Collections.sort(maxCountPerson);
        int[] result = maxCountPerson.stream().mapToInt(i -> i).toArray();
        return result;
    }

    private void addRightAnswerListIfRightAnswer(int persionSoution, int answer, int personNumber) {
        if(persionSoution == answer){
            int count = personRightAnswer.get(personNumber);
            personRightAnswer.put(personNumber, ++count);
        }
    }
}

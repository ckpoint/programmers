package com.algorithm.study.day3;

import java.util.*;

public class Day3Solution {

    private final static int[] PERSON1_SOLUTION = {1, 2, 3, 4, 5};
    private final static int[] PERSON2_SOLUTION = {2, 1, 2, 3, 2, 4, 2, 5};
    private final static int[] PERSON3_SOLUTION = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    private Map<Integer, Integer> PERSION_RIGHT_ANSWER = new HashMap<>();

    public Day3Solution() {
        PERSION_RIGHT_ANSWER.put(1, 0);
        PERSION_RIGHT_ANSWER.put(2, 0);
        PERSION_RIGHT_ANSWER.put(3, 0);
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
        int[] answer = findMaxScoreAndOrderByAsc(PERSION_RIGHT_ANSWER);
        return answer;
    }

    private int[] findMaxScoreAndOrderByAsc(Map<Integer, Integer> totalScore) {
        Map<Integer, Integer> sortedMap = new HashMap<>();

        Integer currentKey = null;
        for(Integer key : totalScore.keySet()){
            Integer value = totalScore.get(key);
            if(value == 0) continue;
            if(sortedMap.size() == 0){
                currentKey = key;
                sortedMap.put(key, value);
                continue;
            }

            if(value > sortedMap.get(currentKey)) {
                sortedMap.clear();
                currentKey = key;
                sortedMap.put(key, value);
            }else if(value == sortedMap.get(currentKey)){
                sortedMap.put(key, value);
            }
        }

        int[] result = new int[sortedMap.size()];

        int index = 0;
        for(Integer key : sortedMap.keySet()){
            result[index] = key;
            index++;
        }

        Arrays.sort(result);

        return result;
    }

    private void addRightAnswerListIfRightAnswer(int persionSoution, int answer, int personNumber) {
        if(persionSoution == answer){
            int count = PERSION_RIGHT_ANSWER.get(personNumber);
            PERSION_RIGHT_ANSWER.put(personNumber, ++count);
        }
    }
}

package com.algorithm.study.day21;

import java.util.*;

/**
 * 1. 우선순위가 정해져 있다. 우선순위 앞쪽에 있는 부분은 모두 뒤로 처리
 * 2. 처음 입력받은 함수의 index 가 중요.
 */
public class Solution {
    private static class Document {
        private int index;
        private int value;

        Document(int index, int value) {
            this.index = index;
            this.value = value;
        }

        int getIndex() {
            return index;
        }

        int getValue() {
            return value;
        }
    }

    public int solution(int[] priorities, int location) {
        LinkedList<Document> documents = new LinkedList<>();
        List<Integer> distictNumber = new LinkedList<>();
        Map<Integer, Integer> result = new HashMap<>();

        for (int i = 0 ; i < priorities.length ; i ++ ) {
            int priority = priorities[i];
            documents.add(new Document(i, priority));
            if(!distictNumber.contains(priority)) {
                distictNumber.add(priority);
            }
        }

        Collections.reverse(distictNumber);

        int resultIndex = 1;

        int documentSize = documents.size();
        while (result.size() != documentSize) {
            Document document = documents.poll();

            Document biggerDocument = documents.stream()
                    .filter(document1 -> document1.getValue() > document.getValue())
                    .findFirst().orElse(null);

            if(biggerDocument == null) {
                result.put(document.getIndex(), resultIndex);
                resultIndex++;
            }else {
                documents.addLast(document);
            }
        }

        return result.get(location);
    }
}

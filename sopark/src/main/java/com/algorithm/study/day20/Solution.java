package com.algorithm.study.day20;

import java.util.Stack;

public class Solution {

    class Line {
        boolean firstSplit = true;

        public boolean isFirstSplit(){
            return this.firstSplit;
        }

        public boolean markFirstSplit() {
            this.firstSplit = false;
            return this.firstSplit;
        }
    }

    public int solution(String arrangement) {
        Stack<Line> stack = new Stack<>();

        char[] charArray = arrangement.toCharArray();

        boolean isNew = false;
        int splitCount = 0;
        for(char word : charArray) {
            if(word == '(') {
                stack.push(new Line());
                isNew = true;
            }else {
                stack.pop();
                if(isNew) {
                    Long firstSplitCount = stack.stream().filter(Line::isFirstSplit).map(Line::markFirstSplit).count();
                    splitCount = splitCount + (stack.size() - firstSplitCount.intValue()) + (firstSplitCount.intValue() * 2);
                }
                isNew = false;
            }
        }

        return splitCount;
    }
}

package com.algorithm.study.day11;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public int[] solution(String[] operations) {
        Command command = new Command();
        Arrays.stream(operations).forEach(operation -> {
            String[] valueArr = operation.split(" ");
            Property property = Property.byValue(valueArr[0]);
            Integer value = Integer.parseInt(valueArr[1]);
            command.execute(property, value);
        });

        return command.getValue();
    }

    enum Property {
        INSERT("I"), DELETE("D");

        String value;

        Property(String value) {
            this.value = value;
        }

        static Property byValue(String value){
            return Arrays.stream(Property.values())
                    .filter(property -> property.value.equals(value))
                    .findAny()
                    .orElseThrow(InvalidParameterException::new);
        }
    }

    class Command {
        PriorityQueue<Integer> maxValueQueue;
        PriorityQueue<Integer> minValueQueue;

        public Command() {
            this.maxValueQueue = new PriorityQueue<>(Collections.reverseOrder());
            this.minValueQueue = new PriorityQueue<>();
        }

        public void execute(Property command, Integer value){
            if(Property.INSERT.equals(command)){
                this.push(value);
            }else if(Property.DELETE.equals(command)){
                this.delete(value);
            }
        }

        private int[] getValue(){
            int minValue = minValueQueue.peek() == null ? 0 : minValueQueue.peek();
            int maxValue = maxValueQueue.peek() == null ? 0 : maxValueQueue.peek();
            return new int[]{maxValue, minValue};
        }

        private void push(Integer value){
            minValueQueue.add(value);
            maxValueQueue.add(value);
        }

        private void delete(Integer value){
            if(value == 1){
                maxValueQueue.poll();
                if(maxValueQueue.size() == 0){
                    minValueQueue.clear();
                }
            } else if(value == -1){
                minValueQueue.poll();
                if(minValueQueue.size() == 0){
                    maxValueQueue.clear();
                }
            }
        }
    }

}

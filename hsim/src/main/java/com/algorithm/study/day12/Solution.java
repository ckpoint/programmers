package com.algorithm.study.day12;

import java.util.LinkedList;

public class Solution {

    LinkedList<Integer> linkedList = new LinkedList();

    public int[] solution(String[] operations) {

        for (String operation : operations) {
           execute(operation);
        }

        if (linkedList.isEmpty()) {
            return new int[]{0, 0};
        }

        return new int[]{linkedList.stream().mapToInt(v -> v).max().getAsInt(), linkedList.stream().mapToInt(v -> v).min().getAsInt()};
    }

    public void execute(String cmd) {

        Integer n = Integer.parseInt(cmd.split(" ")[1]);
        if (cmd.startsWith("I")) {
            this.linkedList.add(n);
            return;
        }

        if (linkedList.isEmpty()) {
            return;
        }

        Integer removeValue = 0;
        if (n < 0) {
            removeValue = linkedList.stream().mapToInt(v -> v).min().getAsInt();
        } else {
            removeValue = linkedList.stream().mapToInt(v -> v).max().getAsInt();
        }

        linkedList.remove(removeValue);
    }
}


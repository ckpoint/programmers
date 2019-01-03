package com.algorithm.study.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    private boolean isPossible(int ball, int checkSize, int[] weight, List<Integer> idxs, int result) {

        System.out.println("ball : " + ball + " checkSize : " + checkSize + "  idx length : " + idxs.size() + "  result : " + result);

        for (int i = 0; i < weight.length; i++) {
            if (idxs == null) {
                idxs = new ArrayList<>();
            }
            if (idxs.contains(i)) {
                continue;
            }
            System.out.println(result + " + " + weight[i]);

            result += weight[i];
            idxs.add(i);

            if (result == ball) {
                return true;
            }

            if (checkSize > idxs.size()) {
                boolean possible = isPossible(ball, checkSize, weight, idxs, result);
                if (possible) {
                    return true;
                }
            }
        }
        return false;
    }

    public int solution(int[] weight) {
        Arrays.sort(weight);
        for (int ball = 1; ; ball++) {
            int finalBall = ball;
            if (Arrays.stream(weight).anyMatch(w -> w == finalBall)) {
                continue;
            }
            int[] filtered = Arrays.stream(weight).filter(w -> w <= finalBall).toArray();
            boolean possible = false;
            for (int i = 2; i < filtered.length; i++) {
                possible = this.isPossible(ball, i, filtered, null, 0);
                if (possible) {
                    break;
                }
            }
            if (!possible) {
                return finalBall;
            }
        }
    }

}

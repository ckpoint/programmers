package com.algorithm.study.day100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {


    public long solution(int[][] rect) {

        List<Rectangles> rectangles = new ArrayList<>();
        Map<Integer, Boolean> xmap = new HashMap<>();
        Map<Integer, Boolean> ymap = new HashMap<>();

        for (int[] r : rect) {
            rectangles.add(new Rectangles(r[0], r[1], r[2], r[3]));
        }

        for (Rectangles rectangle : rectangles) {
            this.putMap(xmap, rectangle.x1);
            this.putMap(xmap, rectangle.x2);

            this.putMap(ymap, rectangle.y1);
            this.putMap(ymap, rectangle.y2);
        }

        Integer[] xs = xmap.keySet().stream().sorted((x1, x2) -> x1 < x2 ? -1 : 1).toArray(Integer[]::new);
        Integer[] ys = ymap.keySet().stream().sorted((y1, y2) -> y1 < y2 ? -1 : 1).toArray(Integer[]::new);
        List<Rectangles> splitRecs = new ArrayList<>();

        for (int i = 0; i < xs.length - 1; i++) {
            for (int j = 0; j < ys.length - 1; j++) {
                splitRecs.add(new Rectangles(xs[i], ys[j], xs[i + 1], ys[j + 1]));
            }
        }

        return splitRecs.stream().parallel().filter(r -> this.isInclude(r, rectangles)).mapToLong(Rectangles::getArea).sum();
    }

    private boolean isInclude(Rectangles rectangles, List<Rectangles> origins) {
        for (Rectangles origin : origins) {
            if (rectangles.includeTo(origin)) {
                return true;
            }
        }
        return false;
    }

    private void putMap(Map<Integer, Boolean> map, Integer val) {
        if (map.get(val) != null) {
            return;
        }
        map.put(val, true);
    }

    class Rectangles {
        private int x1;
        private int x2;
        private int y1;
        private int y2;

        public Rectangles(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        public long getArea() {
            return (this.x2 - this.x1) * (this.y2 - this.y1);
        }

        public boolean includeTo(Rectangles rect) {
            return rect.x1 <= x1 && rect.x2 >= x2 && rect.y1 <= y1 && rect.y2 >= y2;
        }
    }
}

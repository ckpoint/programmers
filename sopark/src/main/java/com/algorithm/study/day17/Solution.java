package com.algorithm.study.day17;

import java.util.Scanner;

public class Solution {

    static int r;
    static int c;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrixSize;
        matrixSize = sc.nextInt();
        r = sc.nextInt();
        c = sc.nextInt();

        matrixSize = 1 << matrixSize;
        search(0, 0, matrixSize);
    }

    public static int search(int size,int foundX, int foundY) {
        r = foundX;
        c = foundY;
        searchR(0,0, 1 << size);
        return 0;
    }

    public static void searchR(int x, int y, int size) {
        if(size == 1) {
            if(x == r && y == c) {
                System.out.println(count);
            }
            count++;
            return;
        }

        int s = size/2;

        searchR(x, y, s);
        searchR(x, y+s, s);
        searchR(x+s, y, s);
        searchR(x+s, y+s, s);
    }
}

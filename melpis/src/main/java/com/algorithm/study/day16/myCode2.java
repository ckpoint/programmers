package com.algorithm.study.day16;

import java.io.*;
import java.util.Scanner;
/*
문제 설명
Problem Statement
You are given the horizontal and vertical lengths of a rectangle. Write a program that returns the area of the rectangle

*Please describe algorithm complexity as comment.

Detailed Behavior Description
[optional]

Input
The first line of the input is the horizontal and vertical lengths of the rectangle. The two lengths are separated by a blank space, and those numbers are integers between 0-1024.

[INTEGER] [INTEGER]
Output
Output one line containing the area of the rectangle.

[INTEGER]
Input example
4 3
Output example
12

*/
public class myCode2
{
    // 해당 코드에 대한 복잡도는 O(1) 입니다. 해당 문제를 해결 하기 위해서는 한단계 연산만 거치기 때문입니다.
    public static int getArea(int width, int height){
        return width * height;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in).useRadix(10);
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        System.out.println(getArea(width, height));
    }
}
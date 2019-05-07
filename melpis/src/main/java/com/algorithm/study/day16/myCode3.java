package com.algorithm.study.day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
/*
문제 설명
Problem statement
Given a window size, W and a stream of number, S. You can see only W numbers in the window. Each time you receive a number from stream S, print max numbers in sliding window.

*Please describe algorithm complexity as comment.

Input
[W]
[N1]
[N2]
...
Where W is the number of the window size, and Nn represents a element in the stream.

Note that, you can assume following things.

An element in the stream will be an integer in the range, -3,000,000,000 ≦ Nn ≦ 3,000,000,000.
the window size W will be an integer in the range, 0 < W ≦ 3,000,000,000.
Output
After you read first W + 1 lines, each time you read the number from the input, print max numbers in sliding window.

[V1]
[V2]
...
Input Example
(Window size W=2 and number stream is S = [2, 1, 2, -1, 3])

2
2
1
2
-1
3
Output Example
2
2
2
3
 */
public class myCode3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int windowSize = Integer.parseInt(br.readLine());
        String temp;
        LinkedList<Integer> linkedList = new LinkedList<>();
        while((temp = br.readLine() ) != null){

            int number = Integer.parseInt(temp);
            linkedList.add(number);
            if(linkedList.size() == windowSize){
//                int max = linkedList.get(0);
//                for(Integer integer:linkedList){
//                    if(max < integer){
//                        max = integer;
//                    }
//                }
//                System.out.println(max);
                System.out.println(Collections.max(linkedList));
                linkedList.remove();
            }
        }
    }
}
package com.algorithm.study.day16;
import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
/*
문제 설명
Problem statement
Implement a FIFO queue with limited size.

It should support the following commands:

SIZE
OFFER x
TAKE
x can be any string.

*Please describe algorithm complexity as comment.

Input
N C
command 1
command 2...
Where N is the number of commands (1 <= N <= 10000) and C the capacity of the queue (0 <= C <= 10000).

Output
For SIZE command, the number of items currently in the queue followed by a newline.
For TAKE command, the item taken followed by a newline if the queue was not empty. Nothing otherwise.
For OFFER command, true if the item was accepted by the queue, or false otherwise, followed by a newline.
Input example
5 2
OFFER hello
OFFER world
OFFER !
TAKE
SIZE
Output example
For the above input,

true
true
false
hello
1
 */
public class myCode4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int i = 0;
        LinkedList<String> linkedList = new LinkedList<>();
        int commandCount = nums[0];
        int queueSize = nums[1];
        while (i < commandCount) {
            String command = br.readLine();
            if (command.contains("OFFER")) {
                if (linkedList.size() == queueSize) {
                    System.out.println(false);
                } else {
                    System.out.println(true);
                    linkedList.add(command.split("\\s+")[1]);
                }

            } else if (command.contains("SIZE")) {
                System.out.println(linkedList.size());
            } else {
                String result = "";
                boolean isEmpty = linkedList.isEmpty();
                if(!isEmpty){
                    result=linkedList.get(0);
                    linkedList.remove();
                }

                System.out.println(result);
            }
            i++;
        }

    }


}
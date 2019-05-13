package com.algorithm.study.day36;


import org.assertj.core.util.Lists;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.lang.Math.round;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long min = 0;
        long max = 0;
        for(int i=0;i<4;i++){
            min += arr[i];
        }
        for(int i=1;i<5;i++){
            max += arr[i];
        }
        System.out.println(min +" "+max);
    }
    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int result = 0;
        Arrays.sort(ar);
        int max = ar[ar.length-1];
        for(int i = 0; i<ar.length;i++){
            if(max==ar[i]){
                result++;
            }
        }
        System.out.println(result);
        return result;
    }
    // Complete the sumXor function below.
    static long sumXor(long n) {
        int zeros = 0;
        while (n!=0) {
            if ((n & 1) ==0)
                ++zeros;
            n >>= 1;
        }
        long l = 1L << zeros;
        System.out.println(l);
        return l;

    }
    // Complete the theGreatXor function below.
    static long theGreatXor(long x) {

        long result = 0;
        int bitPos = 0;
        while(x!=0) {
            if((x&1) == 0) {
                result += (1L<<bitPos);
            }
            bitPos++;
            x >>= 1;
        }
        System.out.println(result);
        return result;
    }
    static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */
        int[] result = new int[grades.length];

        for(int i =0;i<grades.length; i++){
            int grade = grades[i];
            int x = (int) Math.ceil((double) grade / 5) * 5;

            if(x - grade < 3 && grade>= 38){
                result[i] = x;
            }else{
                result[i] = grade;
            }
            System.out.println(result[i]);
        }

        return result;
    }
    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if(v1 < v2) return "NO";
        if(x1 < x2 && v1 > v2) {
            int xDiff = Math.abs(x1 - x2);
            int vDiff = Math.abs(v1 - v2);
            if(xDiff % vDiff == 0) {
                return "YES";
            } else {
                return "NO";
            }
        }
        return "NO";


    }
    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
       // int base = scores[0];
        int min = scores[0];
        int max = scores[0];
        int mincount = 0;
        int maxcount = 0;
        for(int i=1;i<scores.length;i++){
            if(min > scores[i]){
                 min = scores[i];
                 mincount++;
            }
            if(max < scores[i]) {
                max = scores[i];
                maxcount++;
            }
        }

        return new int[]{maxcount,mincount};

    }
    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        for(int i=0;i<s.size();i++){
            Integer integer = s.get(i);
            int temp = 1;
            while(m > temp){
                int index = i + temp;
                if(index >=s.size()){
                    break;
                }
                integer+= s.get(index);
                temp++;
            }
            if(d==integer){
                count++;
            }

        }
        return count;
    }
    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {

        int count = 0;
        for(int i =0; i<ar.length;i++){
            for (int j = i+1;j<ar.length;j++){
                int i1 = ar[i] + ar[j];
                if((i1 % k) == 0){
                    count++;
                }
            }
        }



        return count;
    }

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        Collections.sort(arr);
        Map<Integer, Integer> map  = new HashMap<>();
        for(Integer a: arr){
            if(map.containsKey(a)){
                map.put(a, map.get(a)+1);
            }else{
                map.put(a,1);
            }
        }
        int max =0;
        int maxKey = 0;
        for(Integer key:map.keySet()){
            Integer integer = map.get(key);
            if(max < integer){
                max = integer;
                maxKey = key;
            }
        }

            return maxKey;
    }
    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        if (year == 1918){
            return "26.09.1918";
        }


        if (year % 4 == 0 && (year < 1918 || year % 400 == 0 || year % 100 != 0)){
            return "12.09." + year;
        } else {
            return "13.09." + year;

        }


    }
    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        bill.remove(k);
        int sum = 0;
        for(Integer bi:bill){
            sum+=bi;
        }
        if(sum/2 == b){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(b-sum/2);
        }
    }
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int result  = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer a: ar){
            if(map.containsKey(a)){
                map.put(a, map.get(a)+1);
            }else{
                map.put(a,1);
            }
        }
        for(Integer key:map.keySet()){
            Integer integer = map.get(key);

            result+=integer / 2;

        }
        return result;
    }

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int v =0;
        int lvl = 0;   // current level
        for(char c : s.toCharArray()){
            if(c == 'U') ++lvl;
            if(c == 'D') --lvl;

            // if we just came UP to sea level
            if(lvl == 0 && c == 'U')
                ++v;
        }
        return v;
    }
    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int [] result  = new int[a.length];
        for(int i = 0; i < a.length; i++){
            int newLocation = (i + (a.length - d)) % a.length;
            result[newLocation] = a[i];
        }

        return result;
    }

    static int makeAnagram(String a, String b) {
        int[] lettercounts = new int[26];
        for(char c : a.toCharArray()){
            lettercounts[c-'a']++;
        }
        for(char c : b.toCharArray()){
            lettercounts[c-'a']--;
        }
        int result = 0;
        for(int i : lettercounts){
            result += Math.abs(i);
        }
        return result;

    }

    public static void main(String[] args) throws IOException {

        System.out.println(countingValleys(9,"UDDDUDUU"));
    }
}

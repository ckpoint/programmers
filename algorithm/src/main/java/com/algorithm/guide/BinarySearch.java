package com.algorithm.guide;

public class BinarySearch {

    public int search(int[] arr, int target) {
        int first = 0;
        int last = arr.length;
        int mid;
        while (first <= last) {
            mid = (first + last) / 2;
            int i = mid == arr.length ? 0 : arr[mid];
            if (target == i) {
                return mid;
            } else {
                if (target < i) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }
            }
        }
        return -1;
    }


}

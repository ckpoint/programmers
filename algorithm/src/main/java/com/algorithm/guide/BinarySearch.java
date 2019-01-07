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
    //java.util.Arrays.binarySearch
    public int binarySearch(int[] arr, int key) {
        int low = 0;
        int high =  arr.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = arr[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }


}

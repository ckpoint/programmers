package com.algorithm.guide;

import org.junit.Test;


import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class BinarySearchTest {
    BinarySearch binarySearch = new BinarySearch();

    @Test
    public void searchMatchResult() {
        assertThat( binarySearch.search(new int[]{1, 2, 3, 4}, 2), is(1));
    }
    @Test
    public void searchNotMatchResult() {
        assertThat( binarySearch.search(new int[]{1, 2, 3, 4}, 5), is(-1));
    }


    @Test
    public void searchMatchResultByArrays() {
        assertThat( binarySearch.binarySearch(new int[]{1, 2, 3, 4}, 2), is(1));
    }
    @Test
    public void searchNotMatchResultByArrays() {
        assertThat( binarySearch.binarySearch(new int[]{1, 2, 3, 4}, 5), is(-5));
    }
}
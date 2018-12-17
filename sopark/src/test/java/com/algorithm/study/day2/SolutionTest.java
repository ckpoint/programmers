package com.algorithm.study.day2;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void solutionTest(){
        executeTestByInputData(1, 1);
        executeTestByInputData(2, 2);
        executeTestByInputData(3, 4);
        executeTestByInputData(4, 11);
        executeTestByInputData(5, 12);
        executeTestByInputData(6, 14);
        executeTestByInputData(7, 21);
        executeTestByInputData(8, 22);
        executeTestByInputData(9, 24);
        executeTestByInputData(10, 41);
        executeTestByInputData(11, 42);
        executeTestByInputData(12, 44);
        executeTestByInputData(13, 111);
        executeTestByInputData(14, 112);
        executeTestByInputData(15, 114);
        executeTestByInputData(16, 121);
        executeTestByInputData(17, 122);
        executeTestByInputData(18, 124);
        executeTestByInputData(19, 141);
        executeTestByInputData(20, 142);
        executeTestByInputData(21, 144);
        executeTestByInputData(22, 211);
        executeTestByInputData(23, 212);
        executeTestByInputData(24, 214);
        executeTestByInputData(25, 221);
        executeTestByInputData(26, 222);
    }

    private void executeTestByInputData(int inputData, int expectedData) {
        // Given

        // When
        String result = this.solution.solution(inputData);

        // Then
        assertThat(result, is(String.valueOf(expectedData)));
    }

}

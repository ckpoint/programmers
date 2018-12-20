package com.algorithm.study.none;

import org.junit.Test;

import java.util.stream.IntStream;

public class FloatTest {

    @Test
    public void test_float_nan_01(){

        IntStream.range(0, 10).forEach((i)->{
                    System.out.println(Float.NaN != Float.NaN);
                }
        );
    }
}

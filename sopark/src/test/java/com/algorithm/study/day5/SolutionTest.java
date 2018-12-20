package com.algorithm.study.day5;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class SolutionTest {

    @Test
    public void 두수가같을경우(){
        // Given
        int a = 3;
        int b = 3;

        // When
        long result = new Solution().solution(a, b);

        // Then
        Assert.assertThat("같을 경우엔 둘중 아무수나 리턴", result, is(3L));
    }

    @Test
    public void 케이스_3_5(){
        // Given
        int a = 3;
        int b = 5;

        // When
        long result = new Solution().solution(a, b);

        // Then
        Assert.assertThat("첫번째수가 더 작은 경우", result, is(12L));
    }

    @Test
    public void 케이스_5_3(){
        // Given
        int a = 5;
        int b = 3;

        // When
        long result = new Solution().solution(a, b);

        // Then
        Assert.assertThat("첫번째수가 더 큰 경우", result, is(12L));
    }


    @Test
    public void 케이스_마이너스1_플러스1(){
        // Given
        int a = -1;
        int b = 1;

        // When
        long result = new Solution().solution(a, b);

        // Then
        Assert.assertThat("첫번째수가 더 작은 경우", result, is(0L));
    }
}

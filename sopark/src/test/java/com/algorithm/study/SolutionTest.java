package com.algorithm.study;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SolutionTest {

    @Test
    public void 한명인경우_테스트(){
        // Given
        Solution solution = new Solution();
        String[] participant = new String[]{"sopark"};
        String[] completion = new String[]{};

        // When
        String result = solution.solution(participant, completion);

        // Then
        assertThat("한명이 참가할 경우엔 완주한 사람이 없음", result, is(""));
    }

    @Test
    public void 두명인경우_테스트(){
        // Given
        Solution solution = new Solution();
        String[] participant = new String[]{"sopark", "daou"};
        String[] completion = new String[]{"sopark"};

        // When
        String result = solution.solution(participant, completion);

        // Then
        assertThat("한명이 참가할 경우엔 완주한 사람이 없음", result, is("daou"));

    }


    @Test
    public void 동명이인인경우_테스트(){
        // Given
        Solution solution = new Solution();
        String[] participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = new String[]{"josipa", "filipa", "marina", "nikola"};

        // When
        String result = solution.solution(participant, completion);

        // Then
        assertThat("한명이 참가할 경우엔 완주한 사람이 없음", result, is("vinko"));

    }
}

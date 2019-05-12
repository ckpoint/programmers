package com.algorithm.study.day19;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();
        String result = solution.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
        assertThat(result).isEqualTo("leo");
    }

    @Test
    public void solution2() {
        Solution solution = new Solution();
        String result = solution.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"});
        assertThat(result).isEqualTo("vinko");
    }

    @Test
    public void solution3() {
        Solution solution = new Solution();
        String result = solution.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
        assertThat(result).isEqualTo("mislav");
    }
}
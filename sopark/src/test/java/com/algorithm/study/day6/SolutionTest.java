package com.algorithm.study.day6;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void 사용자가_입장했을때() {
        // Given
        String[] command = new String[]{"Enter uid1234 Muzi"};

        // When
        String[] solution = new Solution().solution(command);

        // Then
        assertThat("입장에대한 메시지", solution[0], is("Muzi님이 들어왔습니다."));
    }

    @Test
    public void 사용자가_입장후_나갔을때() {
        // Given
        String[] command = new String[]{"Enter uid1234 Muzi", "Leave uid1234 Muzi"};

        // When
        String[] solution = new Solution().solution(command);

        // Then
        assertThat("입장과 퇴장대한 메시지", solution[0], is("Muzi님이 들어왔습니다."));
        assertThat("입장과 퇴장대한 메시지", solution[1], is("Muzi님이 나갔습니다."));
    }

    @Test
    public void 사용자가_입장후_나갔다가_새로운닉네임으로입장시() {
        // Given
        String[] command = new String[]{"Enter uid1234 Muzi", "Leave uid1234 Muzi", "Enter uid1234 Daou"};

        // When
        String[] solution = new Solution().solution(command);

        // Then
        assertThat("입장과 퇴장대한 메시지", solution[0], is("Daou님이 들어왔습니다."));
        assertThat("입장과 퇴장대한 메시지", solution[1], is("Daou님이 나갔습니다."));
        assertThat("입장과 퇴장대한 메시지", solution[0], is("Daou님이 들어왔습니다."));
    }


    @Test
    public void 사용자가_입장후_이름변경() {
        // Given
        String[] command = new String[]{"Enter uid1234 Muzi", "Change uid1234 Daou"};

        // When
        String[] solution = new Solution().solution(command);

        // Then
        assertThat("입장시", solution[0], is("Daou님이 들어왔습니다."));
    }
}
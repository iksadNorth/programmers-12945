package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    public void assertAnswer(int s, int answer) {
        // when
        int result = solution.solution(s);

        // then
        Assertions.assertEquals(result, answer);
    }

    @Test @DisplayName("1")
    void testcase1() {
        // given
        int s = 3;
        int answer = 2;

        // when & then
        assertAnswer(s, answer);
    }

    @Test @DisplayName("2")
    void testcase2() {
        // given
        int s = 5;
        int answer = 5;

        // when & then
        assertAnswer(s, answer);
    }

}
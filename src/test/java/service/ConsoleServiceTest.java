package service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsoleServiceTest {

    @Test
    void 정답스크립트_테스트() {
        String answerScript = ConsoleService.setResultScript(0, 1);
        assertEquals("1스트라이크", answerScript);

        answerScript = ConsoleService.setResultScript(1, 0);
        assertEquals("1볼", answerScript);

        answerScript = ConsoleService.setResultScript(1, 1);
        assertEquals("1볼 1스트라이크", answerScript);
    }
}
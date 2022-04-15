package service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ConsoleServiceTest {

    @Test
    void 정답스크립트_테스트() {
        String answerScript = ConsoleService.setResultScript(0, 1);
        assertThat(answerScript).isEqualTo("1스트라이크");

        answerScript = ConsoleService.setResultScript(1, 0);
        assertThat(answerScript).isEqualTo("1볼");

        answerScript = ConsoleService.setResultScript(1, 1);
        assertThat(answerScript).isEqualTo("1볼 1스트라이크");
    }
}
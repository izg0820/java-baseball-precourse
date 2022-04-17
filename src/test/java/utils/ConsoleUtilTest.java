package utils;

import org.junit.jupiter.api.Test;
import utils.ConsoleUtil;

import static org.assertj.core.api.Assertions.*;

class ConsoleUtilTest {

    @Test
    void 정답스크립트_테스트() {
        String answerScript = ConsoleUtil.setResultScript(0, 1);
        assertThat(answerScript).isEqualTo("1스트라이크");

        answerScript = ConsoleUtil.setResultScript(1, 0);
        assertThat(answerScript).isEqualTo("1볼");

        answerScript = ConsoleUtil.setResultScript(1, 1);
        assertThat(answerScript).isEqualTo("1볼 1스트라이크");
    }
}
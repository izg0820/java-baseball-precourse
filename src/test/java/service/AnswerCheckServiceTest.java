package service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.*;

class AnswerCheckServiceTest {

    HashMap<String, Integer> result = null;

    @BeforeEach
    void setUp() {
        result = new HashMap<>();
    }

    @Test
    void 채점() {
        result = AnswerCheckService.answerCheck("475", "345");
        assertThat(result.get("BALL")).isEqualTo(1);
        assertThat(result.get("STRIKE")).isEqualTo(1);
    }

    @Test
    void 정답() {
        result = AnswerCheckService.answerCheck("345", "345");
        assertThat(AnswerCheckService.isCorrect(result, "345".length())).isTrue();

        result.clear();
        result = AnswerCheckService.answerCheck("123", "345");
        assertThat(AnswerCheckService.isCorrect(result, "345".length())).isFalse();

        result.clear();
        result = AnswerCheckService.answerCheck("789", "345");
        assertThat(AnswerCheckService.isNothing(result)).isTrue();

    }
}
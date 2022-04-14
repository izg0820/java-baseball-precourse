package service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class AnswerCheckServiceTest {

    HashMap<String, Integer> result = null;

    @BeforeEach
    void setUp() {
        result = new HashMap<>();
    }

    @Test
    void 채점() {
        result = AnswerCheckService.answerCheck("475", "345");
        assertEquals(1, result.get("BALL"));
        assertEquals(1, result.get("STRIKE"));
    }

    @Test
    void 정답() {
        result = AnswerCheckService.answerCheck("345", "345");
        assertTrue(AnswerCheckService.isCorrect(result, "345".length()));

        result.clear();
        result = AnswerCheckService.answerCheck("123", "345");
        assertFalse(AnswerCheckService.isCorrect(result, "345".length()));
    }
}
package service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.HashMap;

import static org.assertj.core.api.Assertions.*;

class AnswerCheckServiceTest {

    @Test
    void 채점() {
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        AnswerCheckService.answerCheck("475", "345");
        AnswerCheckService.answerCheck("789", "345");
        AnswerCheckService.answerCheck("345", "345");
        assertThat(out.toString().trim()).contains("1볼 1스트라이크", "낫싱", "3스트라이크");
    }

}
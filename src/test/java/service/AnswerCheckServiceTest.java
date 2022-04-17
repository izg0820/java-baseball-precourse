package service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.HashMap;

import static org.assertj.core.api.Assertions.*;

class AnswerCheckServiceTest {


    OutputStream out = null;
    @BeforeEach
    void setUp() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }
    @ParameterizedTest
    @CsvSource(value = {"475:1볼 1스트라이크", "789:낫싱", "345:3스트라이크"}, delimiter = ':')
    void 채점(String myAnswer, String result) {
        AnswerCheckService.answerCheck(myAnswer, "345");
        assertThat(out.toString().trim()).isEqualTo(result);
    }

}
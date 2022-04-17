package service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.*;

class RandomServiceTest {

    String randomNumbers = null;
    @BeforeEach
    void setUp() {
        randomNumbers = RandomService.getRandomNumbers();
    }


    @Test
    void 서로다른_수인가() {
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < randomNumbers.length(); i++) {
            hashSet.add(randomNumbers.charAt(i));
        }
        assertThat( hashSet.size()).isEqualTo(3);

    }
}
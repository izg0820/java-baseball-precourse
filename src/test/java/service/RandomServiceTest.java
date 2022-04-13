package service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class RandomServiceTest {

    private List<Integer> numberList = new ArrayList<>();

    @BeforeEach
    void setUp() {
        RandomService randomService = new RandomService();
        numberList = randomService.getRandomNumbers();
    }


    @Test
    void 서로다른_수인가() {
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer n : numberList) {
            hashSet.add(n);
        }
        assertEquals(3, hashSet.size());
    }
}
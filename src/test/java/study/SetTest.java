package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

public class SetTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("set size method test")
    public void setSizeTest() {
        assertThat(numbers.size()).isEqualTo(3);
    }

    @DisplayName("set contains method test")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    public void setContainsTest(int num) {
        assertThat(numbers.contains(num)).isTrue();
    }

    @DisplayName("set contains method test2")
    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
    public void setContainsTest2(int num, boolean result) {
        assertThat(numbers.contains(num)).isEqualTo(result);
    }
}

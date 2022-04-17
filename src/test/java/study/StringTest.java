package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {


    @Test
    @DisplayName("split method test")
    public void splitTest() {
        String splitCase1 = "1,2";
        String splitCase2 = "1";
        assertThat(splitCase1.split(",")).contains("1", "2");
        assertThat(splitCase2.split(",")).containsExactly("1");
    }

    @Test
    @DisplayName("substring method test")
    public void substringTest() {
        String substringCase = "(1,2)";
        assertThat(substringCase.substring(1, 4)).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt method test")
    public void charAtTest() {
        String idxOutOfBoundExCase = "abc";

        assertThatThrownBy(() -> {
            for (int i = 0; i < 4; i++) {
                idxOutOfBoundExCase.charAt(i);
            }
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("index out of");
    }

    @Test
    @DisplayName("Exception method test")
    public void exceptionTest() {
        String nullPointerExCase = null;
        assertThatNullPointerException().isThrownBy(() -> {
            nullPointerExCase.toString();
        });
    }

}

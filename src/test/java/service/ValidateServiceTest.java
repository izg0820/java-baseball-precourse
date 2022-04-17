package service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ValidateServiceTest {

    @Test
    void 숫자길이_확인() {
        assertThatThrownBy(() -> ValidateService.validateNumberLength("12"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 숫자로만_이루어져있는가() {
        assertThatIllegalArgumentException().isThrownBy(()->{
            ValidateService.validateNumber("12R");
        });
    }
}
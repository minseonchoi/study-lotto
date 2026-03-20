package lotto.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NumberElementTest {
    @Test
    void 번호_생성() {
        NumberElement numberElement = new NumberElement(5);
    }

    @Test
    void 숫자_45이상_에러발생() {
        assertThatThrownBy(() -> new NumberElement(100))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("로또 번호는 1에서 45까지만 입력 가능합니다.");
    }

    @Test
    void 음수_에러발생() {
        assertThatThrownBy(() -> new NumberElement(-1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("로또 번호는 1에서 45까지만 입력 가능합니다.");
    }
}

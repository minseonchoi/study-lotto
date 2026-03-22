package lotto.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class PriceTest {
    @Test
    void 금액_정산_생성() {
        Price price = new Price(1000);
        assertThat(price.getPrice()).isEqualTo(1000);
    }

    @ParameterizedTest
    @ValueSource(ints = {500, 0})
    void 로또가격보다_적은금액_에러발생(int price){
        assertThatThrownBy(() -> new Price(price))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("1000원보다 낮은 금액을 입력하셨습니다.");
    }
}

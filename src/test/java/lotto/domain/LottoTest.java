package lotto.domain;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LottoTest {
    @Test
    void 로또_생성() {
        Lotto lotto = new Lotto(1, 2, 3, 4, 5, 6);
        assertThat(lotto.getNumbers()).hasSize(6);
    }

    @Test
    void 번호_6개가_아닌_경우_에러발생() {
        assertThatThrownBy(() -> new Lotto(1, 2, 3))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("로또 번호를 6개 입력하세요.");
    }
    
    @Test
    void 번호_중복_에러발생() {
        assertThatThrownBy(() -> new Lotto(1, 2, 3, 3, 4, 5))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("로또 번호를 6개 입력하세요.");
    }
}

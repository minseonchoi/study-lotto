package lotto.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class LottosTest {
    @Test
    void 로또_여러개_생성() {
        Lotto lotto1 = new Lotto(1, 2, 3, 4, 5, 6);
        Lotto lotto2 = new Lotto(1, 2, 3, 4, 5, 6);
        Lotto lotto3 = new Lotto(1, 2, 3, 4, 5, 6);
        Lottos lottos = new Lottos(List.of(lotto1, lotto2, lotto3));
    }
}

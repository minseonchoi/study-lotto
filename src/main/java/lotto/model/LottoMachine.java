package lotto.model;

import lotto.domain.NumberElement;

import java.util.*;

public class LottoMachine {
    private static final int LOTTO_SIZE = 6;
    private static final int LOTTO_MAX_NUMBER = 45;

    public static int LottoMachine() {
        Random Random = new Random();
        return Random.nextInt(LOTTO_MAX_NUMBER) + 1;
    }

    public static Set<NumberElement> generateLotto() {
        Set<NumberElement> lottoNumbers = new HashSet<>();
        while (lottoNumbers.size() != LOTTO_SIZE) {
            lottoNumbers.add(new NumberElement(LottoMachine()));
        }
        return lottoNumbers;
    }
}

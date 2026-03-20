package lotto.domain;

import java.util.Objects;

public class NumberElement {
    private static final int LOTTO_MAX_NUMBER = 45;
    private static final int LOTTO_MIN_NUMBER = 1;

    private final int number;

    public NumberElement(int number) {
        validateNumberRange(number);
        this.number = number;
    }

    private void validateNumberRange(int number) {
        if (isNumberBetween(number)) {
            throw new IllegalArgumentException("로또 번호는 1에서 45까지만 입력 가능합니다.");
        }
    }

    private boolean isNumberBetween(int number) {
        return number > LOTTO_MAX_NUMBER || number < LOTTO_MIN_NUMBER;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NumberElement that = (NumberElement) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }
}

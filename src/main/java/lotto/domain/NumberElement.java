package lotto.domain;

import lotto.view.message.ErrorMessage;

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
            throw new IllegalArgumentException(ErrorMessage.INVALID_LOTTO_NUMBER_RANGE.getMessage());
        }
    }

    private boolean isNumberBetween(int number) {
        return number > LOTTO_MAX_NUMBER || number < LOTTO_MIN_NUMBER;
    }

    public int getNumber() {
        return number;
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

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}

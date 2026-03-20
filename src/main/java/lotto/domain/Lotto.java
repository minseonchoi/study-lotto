package lotto.domain;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Lotto {

    private static final int LOTTO_SIZE = 6;

    private final Set<NumberElement> numbers;

    public Lotto(Integer... numbers) {
        this(Arrays.stream(numbers)
                .map(NumberElement::new)
                .collect(Collectors.toCollection(LinkedHashSet::new)));
    }

    public Lotto(Set<NumberElement> numbers) {
        validateSize(numbers);
        this.numbers = numbers;
    }

    private void validateSize(Set<NumberElement> numbers) {
        if (numbers.size() != LOTTO_SIZE) {
            throw new IllegalArgumentException("로또 번호를 6개 입력하세요.");
        }
    }

    public Set<NumberElement> getNumbers() {
        return numbers;
    }

}

package lotto.domain;

import lotto.view.message.ErrorMessage;

public class Price {
    public static final int MIN_PRICE = 1000;

    private final int price;

    public Price(int price) {
        validator(price);
        this.price = price;
    }

    private void validator(int price) {
        if (price < MIN_PRICE) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_PURCHASE_AMOUNT.getMessage());
        }
    }

    public int calculateLottoCount(){
        return price / MIN_PRICE;
    }

    public int getPrice() {
        return price;
    }
}

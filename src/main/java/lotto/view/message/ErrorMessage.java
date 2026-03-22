package lotto.view.message;

public enum ErrorMessage {
    INVALID_LOTTO_SIZE("로또 번호를 6개 입력하세요."),
    INVALID_LOTTO_NUMBER_RANGE("로또 번호는 1에서 45까지만 입력 가능합니다."),
    INVALID_PURCHASE_AMOUNT("1000원보다 낮은 금액을 입력하셨습니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

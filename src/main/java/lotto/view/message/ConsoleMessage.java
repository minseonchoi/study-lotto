package lotto.view.message;

public enum ConsoleMessage {
    INPUT_PURCHASE_AMOUNT("구입금액을 입력해 주세요."),
    OUTPUT_LOTTO_COUNT("%d개를 구매했습니다."),
    INPUT_WINNING_NUMBERS("지난 주 당첨 번호를 입력해 주세요."),
    WINNING_STATISTICS_TITLE("당첨 통계"),
    WINNING_STATISTICS_SEPARATOR("--------------------"),
    MATCH_RESULT_FORMAT("%d개 일치 (%d원)- %d개"),
    TOTAL_RETURN_RATE("총 수익률은 %.2f 입니다."),
    TOTAL_RETURN_RATE_WITH_COMMENT("총 수익률은 %.2f 입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)");


    private final String message;

    ConsoleMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String format(Object... args) {
        return String.format(message, args);
    }
}

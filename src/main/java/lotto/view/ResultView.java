package lotto.view;

import lotto.domain.Lottos;
import lotto.domain.Price;
import lotto.view.message.ConsoleMessage;

public class ResultView {
    private ResultView(){}

    public static void printStartMessage() {
        System.out.println(ConsoleMessage.INPUT_PURCHASE_AMOUNT.getMessage());
    }

    public static void printLottoCountMessage(Price price) {
        int lottoCount = price.calculateLottoCount();
        System.out.println(ConsoleMessage.OUTPUT_LOTTO_COUNT.format(lottoCount));
    }

    public static void printLottosList(Lottos lottos) {
        System.out.println(lottos.printLottos());
    }

    public static void printResultNumberMessage() {
        System.out.println(ConsoleMessage.INPUT_WINNING_NUMBERS.getMessage());
    }
}

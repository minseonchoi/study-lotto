package lotto;

import lotto.domain.Lotto;
import lotto.domain.Lottos;
import lotto.domain.Price;
import lotto.model.LottoMachine;

import java.util.ArrayList;
import java.util.List;

import static lotto.view.InputView.*;
import static lotto.view.ResultView.*;

public class LottoMain {
    public static void main(String[] args) {
        printStartMessage();

        Price price = inputPrice();
        printLottoCountMessage(price);

        List<Lotto> lottos = new ArrayList<>();
        for (int i = 0; i < price.calculateLottoCount(); i++) {
            lottos.add(new Lotto(LottoMachine.generateLotto()));
        }

        printLottosList(new Lottos(lottos));

        printResultNumberMessage();

    }
}

package lotto.view;

import lotto.domain.Lotto;
import lotto.domain.NumberElement;
import lotto.domain.Price;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public static Price inputPrice() {
         int price = scanner.nextInt();
         return new Price(price);
    }

    public static Lotto InputResultNumber(){
        String result = scanner.nextLine();
        String[] results = result.replaceAll(" ", "").split(",");

        Set<NumberElement> resultNumbers = new HashSet<>();
        for (String resultNumber : results) {
            NumberElement numberElement = new NumberElement(Integer.parseInt(resultNumber));
            resultNumbers.add(numberElement);
        }

        return new Lotto(resultNumbers);
    }
}

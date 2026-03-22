package lotto.domain.constans;

public enum LottoRank {
    FIRST(2_000_000_000),
    SECOND(1_500_000),
    THIRD(50_000),
    FOURTH(5_000);

    private final int lottoPrice;

    LottoRank(int lottoPrice) {
        this.lottoPrice = lottoPrice;
    }

    public int getLottoPrice() {
        return lottoPrice;
    }
}

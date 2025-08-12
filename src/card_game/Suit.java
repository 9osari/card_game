package card_game;

public enum Suit {
    SPADE("♠\uFE0F"),
    HEART("❤\uFE0F"),
    DIAMOND("\uD83D\uDC8E"),
    CLUB("♣\uFE0F");

    private String symbol;

    Suit(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}

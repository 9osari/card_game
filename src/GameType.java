public enum GameType {
    POKER_GAME(2, 5); //2명 5장

    private int playerCount;
    private int cardCount;

    GameType(int playerCount, int cardCount) {
        this.playerCount = playerCount;
        this.cardCount = cardCount;
    }
    public int getPlayerCount() {
        return playerCount;
    }
    public int getCardCount() {
        return cardCount;
    }

}

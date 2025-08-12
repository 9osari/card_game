package card_game_v2;

public class GameMain {
    public static void main(String[] args) {
        DealerImpl dealer = new DealerImpl();
        PlayerImpl player1 = new PlayerImpl();
        PlayerImpl player2 = new PlayerImpl();
        DeckImpl deck = new DeckImpl();

        Game game = new PokerGame(dealer, player1, player2, deck);
        game.gameStart();
    }
}

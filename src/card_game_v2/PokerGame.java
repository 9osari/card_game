package card_game_v2;

public class PokerGame implements Game {
    private final DealerImpl dealer;
    private final PlayerImpl player1;
    private final PlayerImpl player2;
    private final DeckImpl deck;

    public PokerGame(DealerImpl dealer, PlayerImpl player1, PlayerImpl player2, DeckImpl deck) {
        this.dealer = dealer;
        this.player1 = player1;
        this.player2 = player2;
        this.deck = deck;
    }

    @Override
    public void gameStart() {
        deck.shuffle();
        for (int i = 0; i < 5; i++) {
            player1.addCard(deck.draw());
            player2.addCard(deck.draw());
        }
        player1.sortCard();
        player2.sortCard();

        dealer.judgMent(player1, player2);
    }
}

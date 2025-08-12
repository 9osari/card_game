package card_game_v2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckImpl implements Deck {
    private final List<Card> cards = new ArrayList<>();

    public DeckImpl() {
        Suit[] patterns = {Suit.SPADE, Suit.HEART, Suit.CLUB, Suit.DIAMOND};
        for(int i = 1; i <= 13; i++) {
            for(int j = 0; j < 4; j++) {
                cards.add(new Card(i, patterns[j]));
            }
        }
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public Card draw() {
        return cards.remove(0);
    }
}

package card_game_v2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerImpl implements Player {
    private final List<Card> cards = new ArrayList<>();

    @Override
    public void addCard(Card card) {
        cards.add(card);
    }

    @Override
    public void sortCard() {
        Collections.sort(cards);
    }

    @Override
    public List<Card> showCard() {
        return cards;
    }

    @Override
    public int sumCard() {
        return cards.stream().mapToInt(Card::getNum).sum();
    }
}



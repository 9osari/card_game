package card_game_v2;

import java.util.List;

public interface Player {
    void addCard(Card card);
    void sortCard();
    List<Card> showCard();
    int sumCard();
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    /**
     * 카드 뭉치
     */
    public Deck() {
        String[] patterns = {"Spade", "Heart", "Diamond", "Club"};
        for(int i = 1; i <= 13; i++) {
            for(int j = 0; j < 4; j++) {
                cards.add(new Card(i, patterns[j]));
            }
        }
    }

    /**
     * 덱에 있는 카드 쓰까묵음
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * 카드를 한장 준다
     */
    public Card draw() {
        return cards.remove(0);
    }

    /**
     * 단순 사이즈 반환
     * @return cards.size();
     */
    public int size() {
        return cards.size();
    }

    @Override
    public String toString() {
        return Arrays.toString(cards.toArray());
    }

}

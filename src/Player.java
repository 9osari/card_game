import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player {
    private String name; //자신의 이름 가지기
    private List<Card> hand = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    /**
     * 카드 5장 받아서 보관 후 정렬
     */
    public void receivCard(Deck deck) {
        for(int i = 0; i < 5; i++) {
            hand.add(deck.draw());
        }
        Collections.sort(hand);
    }

    /**
     * 자신의 카드 합계 계산
     */
    public int getSum() {
        int sum = 0;
        for(Card card : hand) {
            sum += card.getNum();
        }
        return sum;
    }

    /**
     * 자신의 카드 출력
     */
    public List<Card> getHand() {
        return hand;
    }

}

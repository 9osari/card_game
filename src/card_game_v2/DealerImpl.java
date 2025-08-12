package card_game_v2;

import java.util.List;

public class DealerImpl implements Dealer {

    @Override
    public void judgMent(Player player1, Player player2) {
        int sum1 = player1.sumCard();
        int sum2 = player2.sumCard();

        List<Card> cards1 = player1.showCard();
        List<Card> cards2 = player2.showCard();

        System.out.println("플레이어1의 카드: " + cards1 + ", 합계: " + sum1);
        System.out.println("플레이어2의 카드: " + cards2 + ", 합계: " + sum2);

        // 승부 판정
        if (sum1 > sum2) {
            System.out.println("플레이어1 승리");
        } else if (sum2 > sum1) {
            System.out.println("플레이어2 승리");
        } else {
            System.out.println("무승부");
        }
    }
}

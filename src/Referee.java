import java.util.ArrayList;
import java.util.List;


public class Referee implements Game {
    int playerCount = GameType.POKER_GAME.getPlayerCount();

    private List<Player> players = new ArrayList<>();
    Deck deck = new Deck();

    @Override
    public void gameStart() {
        deck.shuffle();

        for(int i = 0; i < playerCount; i++) {
            players.add(new Player("플레이어" + (i+1)));
            players.get(i).receivCard(deck);
        }
        judgMent();
    }

    @Override
    public void judgMent() {
        int maxSum = 0;
        List<Player> winners = new ArrayList<>();

        for (Player player : players) {
            int sum = player.getSum();
            System.out.println("플레이어1의 카드: "+player.getHand() + ", 합계: " + sum);

            if(sum > maxSum) {
                maxSum = sum;
                winners.clear();
                winners.add(player);
            } else if(sum == maxSum) {
                winners.add(player);
            }
        }
        if(winners.size() == 1) {
            System.out.println(winners.get(0).getName() + " 승리");
        } else {
            System.out.println("무승부");
        }

    }

}

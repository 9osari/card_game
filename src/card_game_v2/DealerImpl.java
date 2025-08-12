package card_game_v2;

import java.util.List;

public class DealerImpl implements Dealer {

    @Override
    public void judgMent(List<Player> players) {
        printPlayerInfo(players);   //플레이어 정보 출력

        findWinner(players);    //승자 판정

        //판정과 출력 책임이 2개 있어서 출력을 따로 분리해야하는지..?
    }

    private void findWinner(List<Player> players) {
        //판정
        int maxSum = 0;
        String result = "";

        for(int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            int sum = player.sumCard();

            if(sum > maxSum) {
                maxSum = sum;
                result = "플레이어" + (i + 1) + " 승리";
            } else if(sum == maxSum) {
                result = "무승부";
            }
        }

        System.out.println(result);
    }

    private void printPlayerInfo(List<Player> players) {
        //정보출력
        for(int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            System.out.println("플레이어" + (i+1) + ": " + player.showCard() + " (합계: " + player.sumCard() + ")");
        }
    }
}

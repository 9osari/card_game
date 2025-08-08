public class Referee implements Game{
    Player player1 = new Player("player1");
    Player player2 = new Player("player2");
    Deck deck = new Deck();

    @Override
    public void gameStart() {
        deck.shuffle();
        player1.receivCard(deck);
        player2.receivCard(deck);
        judgMent();
    }

    @Override
    public void judgMent() {
        int sum1 = player1.getSum();
        int sum2 = player2.getSum();

        System.out.println("플레이어1의 카드: " + player1.getHand() + ", 합계: " + sum1);
        System.out.println("플레이어2의 카드: " + player2.getHand() + ", 합계: " + sum2);

        if(sum1 > sum2) {
            System.out.println("플레이어 1 승리");
        } else if (sum2 > sum1) {
            System.out.println("플레이어 2 승리");
        } else {
            System.out.println("무승부");
        }
    }

}

package card_game;

public class Main {
    public static void main(String[] args) {
        Game game = new Referee();
        game.gameStart();

        /*cardTest();
        deckTest();
        playerTest();*/
    }


    private static void cardTest() {
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡcardTestㅡㅡㅡㅡㅡㅡㅡㅡ");
        Card card1 = new Card(1, Suit.SPADE);
        Card card2 = new Card(1, Suit.HEART);
        System.out.println("card1.compareTo(card2): "+card1.compareTo(card2));
        System.out.println("card1: "+card1);
    }

    private static void deckTest() {
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡdeckTestㅡㅡㅡㅡㅡㅡㅡ");
        Deck deck = new Deck();
        System.out.println("섞기 전: "+deck);
        deck.shuffle();
        System.out.println("섞은 후: "+deck);
        System.out.println("사쿠라네?: " + deck.draw());
    }

    private static void playerTest() {
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡplayerTestㅡㅡㅡㅡㅡㅡㅡ");
        Player player = new Player("player1");
        Deck deck = new Deck();
        deck.shuffle();
        player.receivCard(deck);
        System.out.println(player + " sum: " + player.getSum());
    }
}
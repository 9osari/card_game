package card_game_v2;

import java.util.ArrayList;
import java.util.List;

public class PokerGame implements Game {
    private final Dealer dealer;
    private final List<Player> players;
    private final Deck deck;

    public PokerGame() {
        dealer = new DealerImpl();
        players = new ArrayList<>();
        deck = new DeckImpl();
    }

    @Override
    public void gameStart() {
        initializePlayers();    //플레이어 생성

        deck.shuffle();     //카드 섞기

        distributeCards();  //카드 배분

        dealer.judgMent(players);   //승자 판정
    }

    private void distributeCards() {
        // 각 플레이어에게 5장씩 배분
        for (Player player : players) {
            for (int i = 0; i < 5; i++) {
                player.addCard(deck.draw());
            }
            player.sortCard(); //정렬
        }
    }

    private void initializePlayers() {
        // 플레이어 생성
        for (int i = 0; i < 2; i++) {
            players.add(new PlayerImpl());
        }
    }
}

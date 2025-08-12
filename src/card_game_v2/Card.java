package card_game_v2;

public class Card implements Comparable<Card> {
    private int num;
    private Suit pattern;

    public Card(int num, Suit pattren) {
        this.num = num;
        this.pattern = pattren;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return num + "("+ pattern.getSymbol()+")";
    }


    /**
     * 패턴 비교는 Enum.compareTo()를 활용
     * (Enum의 선언 순서에 따라 자동으로 비교됨)
     *
     * Suit.compareTo()는 final이라 재정의 불가하므로 기본 구현을 그대로 사용
     */
    @Override
    public int compareTo(Card o) {
        if(this.num != o.num) {
            return Integer.compare(this.num, o.num);    //숫자 비교
        } else {
            return this.pattern.compareTo(o.pattern);   //같은 숫자면 ENUM 순서로
        }
    }
}

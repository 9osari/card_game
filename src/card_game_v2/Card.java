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

    public Suit getPattern() {
        return pattern;
    }

    @Override
    public String toString() {
        return num + "("+ pattern.getSymbol()+")";
    }


    /**
     * ENUM을 가지고 비교하도록 자바 내부에서 구현이 되어있음...
     * ENUM 자체의 순서를 가지고 compareTo를 비교..
     * final이라 재구현 불가
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

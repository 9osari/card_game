public class Card implements Comparable<Card>{
    private int num;
    private String pattern;

    public Card(int num, String pattern) {
        this.num = num;
        this.pattern = pattern;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        String symbol = "";
        if(pattern.equals("Spade")) {
            symbol = "♠\uFE0F";
        } else if(pattern.equals("Heart")) {
            symbol = "❤\uFE0F";
        } else if(pattern.equals("Club")) {
            symbol = "♣\uFE0F";
        } else {
            symbol = "\uD83D\uDC8E";
        }
        return num + "("+symbol+")";
    }

    /**
     * compareTo -> 객체 정렬
     * 현재 객체가 인수로 주어진 객체보다 더 작으면 음수, 예( -1 )
     * 두 객체의 크기가 같으면 0
     * 현재 객체가 인수로 주어진 객체보다 더 크면 양수, 예( 1 )
     */
    @Override
    public int compareTo(Card o) {
        if(this.num < o.num) {
            return -1;
        } else if(this.num > o.num) {
            return 1;
        } else {
            //같은 숫자의 경우 ♠, ♥, ♦, ♣ 순으로 정렬한다. ♠가 가장 먼저
            int thisPattern = getPattern(this.pattern);
            int oPattern = getPattern(o.pattern);
            if(thisPattern < oPattern) {
                return -1;
            } else if(thisPattern > oPattern) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    /**
     * 패턴 순서 구분
     * 1(♠), 1(♥), 2(♦), 3(♣) 순서로 출력
     */
    public int getPattern(String pattern) {
        if(pattern.equals("Spade")) {
            return 0;
        } else if(pattern.equals("Heart")) {
            return 1;
        } else if(pattern.equals("Diamond")) {
            return 2;
        } else {
            return 3;
        }
    }
}

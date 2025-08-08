//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Card card1 = new Card(1, "Spade");
        Card card2 = new Card(2, "Heart");
        System.out.println(card1.compareTo(card2));
        System.out.println(card1);
        System.out.println(card2);
    }
}
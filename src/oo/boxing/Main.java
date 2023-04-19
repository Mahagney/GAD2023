package oo.boxing;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Leonidas", 90, 25);
        Fighter fighter2 = new Fighter("Jack", 110, 20);

        BoxingMatch boxingMatch = new BoxingMatch(fighter1, fighter2);
        String winner = boxingMatch.fight();
        System.out.println("Winner is: " + winner);
    }
}

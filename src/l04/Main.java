package l04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int player1 = in.nextInt();
        int player2 = in.nextInt();

        MasterMind p1 = new MasterMind(player1,player2);
        p1.addToArray();
        System.out.println(p1.compareMastermind());


    }
}

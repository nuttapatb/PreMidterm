package l05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        Vocab v = new Vocab(answer);
        Hangman hang = new Hangman();
        hang.startHangman(v);

    }
}

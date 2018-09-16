package l05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

    protected ArrayList<String > charAnswer = new ArrayList<>();
    protected ArrayList<String> charInput = new ArrayList<>();
    protected String input, result, newAnswer, answer;
    protected String guessInout;
    protected String[] answer2;
    protected int numberOfArray = 0;
    protected boolean lap = true;
    protected int countToLose = 6;

    
    public void startHangman (Vocab v) {
        newAnswer = v.getVocab().toLowerCase();
        answer2 = newAnswer.split("");
        System.out.print(countToLose + " ");
        for (int i = 0; i < answer2.length ; i++) {
            charAnswer.add(answer2[i]);
            answer2[i] = "-";
            System.out.print(answer2[i]);

        }
        System.out.print("\n");
        numberOfArray = charAnswer.size();

        countToDead();
        showResult();

    }

    public void countToDead () {
        while (countToLose != 0) {

            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            for (int i = 0; i < charAnswer.size() ; i++) {
                if (charAnswer.get(i).equals(input)) {
                    answer2[i] = input;
                }
            }
            System.out.print(countToLose + " ");


            for (int i = 0; i < answer2.length ; i++) {
                System.out.print(answer2[i]);
            }
            System.out.print("\n");

            
        }



    }




    public void showResult () {
        if (answer2.equals(charAnswer)) {
            System.out.println("Congratulations, you win");
        } else if (countToLose == 0) {
            System.out.println("You lose, the answer is hangman");
        }
    }

}

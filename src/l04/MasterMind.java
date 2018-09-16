package l04;

import java.util.ArrayList;

public class MasterMind {
    protected int target;
    protected int answer;
    protected int count = 0;
    protected int countCorrect = 0;
    protected String ans;
    protected ArrayList<String> dataTarget = new ArrayList<>();
    protected ArrayList<String> dataAnswer = new ArrayList<>();

    public MasterMind(int target, int answer) {
        this.target = target;
        this.answer = answer;
    }

    public void addToArray() {
        String playerTarget;
        String playerAnswer;
        playerTarget = target + "";
        playerAnswer = answer + "";

        for (int i = 0; i < playerTarget.length() ; i++) {
            dataTarget.add(String.valueOf(playerTarget.charAt(i)));
        }
        for (int i = 0; i < playerAnswer.length() ; i++) {
            dataAnswer.add(String.valueOf(playerAnswer.charAt(i)));
        }
    }

    public String compareMastermind() {

        for (int i = 0; i < dataTarget.size() ; i++) {
            if (dataTarget.get(i).equals(dataAnswer.get(i))) {
                count ++;
                countCorrect ++;
                ans = ("Congratulations, you just mastered my mind!!");
            }

            else {
                for (int j = 0; j < dataTarget.size(); j++) {
                    if (dataTarget.get(i).equals(dataAnswer.get(j))) {
                        count ++;
                        ans = count + " " + countCorrect;
                    }

                    else {
                        ans = count + " " + countCorrect;
                    }

                }
            }
        }
        return ans;
    }
}

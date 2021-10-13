package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void launchEvenGame() {
        String[][] questionAndAnswer = new String[Util.ANSWERS][2];
        for (int i = 0; i != Util.COUNTER; i++) {
            int randomNum = Util.getRandomNum(Util.MIN_RANGE_RANDOM, Util.MAX_RANGE_RANDOM);
            String answer = isEven(randomNum) ? "yes" : "no";
            questionAndAnswer[i][0] = String.valueOf(randomNum);
            questionAndAnswer[i][1] = answer;
        }
        Engine.runEngine(questionAndAnswer, RULES);
    }

    public static boolean isEven(int randomNum) {
        return randomNum % 2 == 0;
    }
}


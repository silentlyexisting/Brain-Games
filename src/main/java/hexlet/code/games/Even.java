package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void launchEvenGame() {
        String[][] result = new String[Util.ANSWERS][2];
        for (int i = 0; i != Util.COUNTER; i++) {
            int randomNum = Util.getRandomNum(Util.MIN_RANGE_RANDOM, Util.MAX_RANGE_RANDOM);
            String answer = findCorrectAnswer(randomNum) ? "yes" : "no";
            result[i][0] = String.valueOf(randomNum);
            result[i][1] = answer;
        }
        Engine.runEngine(result, RULES);
    }

    public static boolean findCorrectAnswer(int randomNum) {
        if (randomNum % 2 == 0) {
            return true;
        }
        return  false;
    }
}


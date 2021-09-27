package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void launchEvenGame() {
        String[][] result = new String[Util.ANSWERS][2];
        for (int i = 0; i != Util.COUNTER; i++) {
            int randomNum = Util.getRandomNum(Util.MIN_RANGE_RANDOM, Util.MAX_RANGE_RANDOM);
            String answer = getCorrectAnswerForEvenGame(randomNum);
            result[i][0] = Util.questionNumToString(randomNum);
            result[i][1] = answer;
        }
        Engine.gameEngine(result, RULES);
    }

    public static String getCorrectAnswerForEvenGame(int randomNumForEven) {
        if (randomNumForEven % 2 == 0) {
            return  "yes";
        }
        return  "no";
    }
}


package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void launchPrimeGame() {
        String[][] result = new String[Util.ANSWERS][2];
        for (int i = 0; i != Util.COUNTER; i++) {
            int numForPrime = Util.getRandomNum(Util.MIN_RANGE_RANDOM, Util.MAX_RANGE_RANDOM);
            String answer = getCorrectAnswerForCalcGame(numForPrime);
            result[i][0] = Util.questionNumToString(numForPrime);
            result[i][1] = answer;
        }
        Engine.gameEngine(result, RULES);
    }

    public static String getCorrectAnswerForCalcGame(int numForPrime) {
        int i = 2;
        boolean checkPrime = false;
        while (i <= numForPrime / 2) {
            if (numForPrime % i  == 0) {
                checkPrime = true;
                break;
            }
            i++;
        }
        if (!checkPrime) {
            return  "yes";
        } else {
            return  "no";
        }
    }
}

package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void launchPrimeGame() {
        String[][] result = new String[Util.ANSWERS][2];
        for (int i = 0; i != Util.COUNTER; i++) {
            int randomNum = Util.getRandomNum(Util.MIN_RANGE_RANDOM, Util.MAX_RANGE_RANDOM);
            String answer = correctAnswer(randomNum) ? "yes" : "no";
            result[i][0] = String.valueOf(randomNum);
            result[i][1] = answer;
        }
        Engine.runEngine(result, RULES);
    }

    public static boolean correctAnswer(int randomNum) {
        int i = 2;
        boolean checkPrime = false;
        while (i <= randomNum / 2) {
            if (randomNum % i  == 0) {
                checkPrime = true;
                break;
            }
            i++;
        }
        return !checkPrime;
    }
}

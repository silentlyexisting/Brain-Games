package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void launchPrimeGame() {
        String[][] questionAndAnswer = new String[Util.ANSWERS][2];
        for (int i = 0; i != Util.COUNTER; i++) {
            int randomNum = Util.getRandomNum(Util.MIN_RANGE_RANDOM, Util.MAX_RANGE_RANDOM);
            String answer = isPrime(randomNum) ? "yes" : "no";
            questionAndAnswer[i][0] = String.valueOf(randomNum);
            questionAndAnswer[i][1] = answer;
        }
        Engine.runEngine(questionAndAnswer, RULES);
    }

    public static boolean isPrime(int number) {
        int i = 2;
        boolean checkPrime = false;
        while (i <= number / 2) {
            if (number % i  == 0) {
                checkPrime = true;
                break;
            }
            i++;
        }
        return !checkPrime;
    }
}

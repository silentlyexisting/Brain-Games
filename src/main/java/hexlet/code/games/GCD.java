package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    public static void launchGcdGame() {
        String[][] result = new String[Util.ANSWERS][2];
        for (int i = 0; i < Util.COUNTER; i++) {
            int firstNumForGcd = Util.getRandomNum(Util.MIN_RANGE_RANDOM, Util.MAX_RANGE_RANDOM);
            int secondNumForGcd = Util.getRandomNum(Util.MIN_RANGE_RANDOM, Util.MAX_RANGE_RANDOM);
            result[i][0] = gcdQuestionToString(firstNumForGcd, secondNumForGcd);
            result[i][1] = correctAnswerToString(correctAnswerGcd(firstNumForGcd, secondNumForGcd));
        }
        Engine.gameEngine(result, RULES);
    }
    public static String gcdQuestionToString(int firstNumForGcd, int secondNumForGcd) {
        return firstNumForGcd + " " + secondNumForGcd;
    }

    public static int correctAnswerGcd(int firstNumForGcd, int secondNumForGcd) {
        int tempResultNum = 0;
        while (firstNumForGcd != secondNumForGcd) {
            if (firstNumForGcd > secondNumForGcd) {
                firstNumForGcd = firstNumForGcd - secondNumForGcd;
                tempResultNum = firstNumForGcd;
            } else {
                secondNumForGcd = secondNumForGcd - firstNumForGcd;
                tempResultNum = secondNumForGcd;
            }
        }
        return tempResultNum;
    }
    public static String correctAnswerToString(int answerNumForGcd) {
        return String.valueOf(answerNumForGcd);
    }
}

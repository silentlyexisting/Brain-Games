package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    private static final String RULES = "Find the greatest common divisor of given numbers.";

    public static void launchGcdGame() {
        String[][] result = new String[Util.ANSWERS][2];
        for (int i = 0; i < Util.COUNTER; i++) {
            int firstNum = Util.getRandomNum(Util.MIN_RANGE_RANDOM, Util.MAX_RANGE_RANDOM);
            int secondNum = Util.getRandomNum(Util.MIN_RANGE_RANDOM, Util.MAX_RANGE_RANDOM);
            result[i][0] = buildQuestion(firstNum, secondNum);
            result[i][1] = String.valueOf(findCorrectAnswer(firstNum, secondNum));
        }
        Engine.runEngine(result, RULES);
    }

    public static String buildQuestion(int firstNum, int secondNum) {
        return firstNum + " " + secondNum;
    }

    public static int findCorrectAnswer(int firstNum, int secondNum) {
        int tempResultNum = 0;
        while (firstNum != secondNum) {
            if (firstNum > secondNum) {
                firstNum = firstNum - secondNum;
                tempResultNum = firstNum;
            } else {
                secondNum = secondNum - firstNum;
                tempResultNum = secondNum;
            }
        }
        return tempResultNum;
    }
}

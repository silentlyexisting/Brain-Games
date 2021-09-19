package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    public static String getRules() {
        return "What is the result of the expression?";
    }

    public static void launchCalcGame() {
        String[][] result = new String[Util.ANSWERS][2];
        for (int i = 0; i != Util.COUNTER; i++) {
            String[] temp = getRandom();
            result[i][0] = temp[0];
            result[i][1] = temp[1];
        }
        Engine.gameEngine(result, getRules());
    }

    public static String[] getRandom() {
        int resultOfExpression = 0;

        String[] calcResult = new String[2];

        String[] operator = {"+", "-", "*"};

        int[] getRandomOperator = Util.getRandomNum(0, 2, 1);

        int[] randomNum = Util.getRandomNum(Util.MIN_RANGE_RANDOM, Util.MAX_RANGE_RANDOM, Util.AMMOUNT_OF_RANDOM_NUMS2);

        String stringFormOperation = randomNum[0] + " " + operator[getRandomOperator[0]] + " " + randomNum[1];

        calcResult[0] = stringFormOperation;

        if (getRandomOperator[0] == 0) {
            resultOfExpression = randomNum[0] + randomNum[1];
        }
        if (getRandomOperator[0] == 1) {
            resultOfExpression = randomNum[0] - randomNum[1];
        }
        if (getRandomOperator[0] == 2) {
            resultOfExpression = randomNum[0] * randomNum[1];
        }
        calcResult[1] = String.valueOf(resultOfExpression);
        return calcResult;
    }
}

package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Random;

public class Calc {
     private static Random random = new Random();
     private static final int MIN_RANGE_RANDOM = 1;
     private static final int MAX_RANGE_RANDOM = 100;
     private static final int AMMOUNT_OF_RANDOM_NUMS = 2;
     private static final int COUNTER = 3;
     private static final int ANSWERS = 3;

    public static String getRules() {
        return "What is the result of the expression?";
    }

    public static void launchCalcGame() {
        String[][] result = new String[ANSWERS][2];
        for (int i = 0; i != COUNTER; i++) {
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

        int getRandomOperator = random.nextInt(operator.length);

        int[] randomNum = Util.getRandomNum(MIN_RANGE_RANDOM, MAX_RANGE_RANDOM, AMMOUNT_OF_RANDOM_NUMS);

        String stringFormOperation = randomNum[0] + " " + operator[getRandomOperator] + " " + randomNum[1];

        calcResult[0] = stringFormOperation;

        if (getRandomOperator == 0) {
            resultOfExpression = randomNum[0] + randomNum[1];
        }
        if (getRandomOperator == 1) {
            resultOfExpression = randomNum[0] - randomNum[1];
        }
        if (getRandomOperator == 2) {
            resultOfExpression = randomNum[0] * randomNum[1];
        }
        calcResult[1] = String.valueOf(resultOfExpression);
        return calcResult;
    }
}

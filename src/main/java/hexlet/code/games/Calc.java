package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    private static final String RULES = "What is the result of the expression?";
    public static void launchCalcGame() {
        String[][] result = new String[Util.ANSWERS][2];
        for (int i = 0; i != Util.COUNTER; i++) {
            String[] temp = getRandom();
            result[i][0] = temp[0];
            result[i][1] = temp[1];
        }
        Engine.gameEngine(result, RULES);
    }

    public static String calcQuestionToString(int firstNumForCalc, int secondNumForCalc, String operator) {
        return firstNumForCalc + " " + operator + " " + secondNumForCalc;
    }

    public static String[] getRandom() {
        int resultOfExpression = 0;
        String[] calcResult = new String[2];
        String[] operator = {"+", "-", "*"};
        int getRandomOperator = Util.getRandomNum(0, 2);
        int firstNumForCalc = Util.getRandomNum(Util.MIN_RANGE_RANDOM, Util.MAX_RANGE_RANDOM);
        int secondNumForCalc = Util.getRandomNum(Util.MIN_RANGE_RANDOM, Util.MAX_RANGE_RANDOM);
        String stringFormOperation = calcQuestionToString(firstNumForCalc, secondNumForCalc,
                operator[getRandomOperator]);
        calcResult[0] = stringFormOperation;
        if (getRandomOperator == 0) {
            resultOfExpression = firstNumForCalc + secondNumForCalc;
        }
        if (getRandomOperator == 1) {
            resultOfExpression = firstNumForCalc - secondNumForCalc;
        }
        if (getRandomOperator == 2) {
            resultOfExpression = firstNumForCalc * secondNumForCalc;
        }
        calcResult[1] = String.valueOf(resultOfExpression);
        return calcResult;
    }
}

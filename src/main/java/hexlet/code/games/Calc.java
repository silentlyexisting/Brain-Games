package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    private static final String RULES = "What is the result of the expression?";
    private static final String[] OPERATOR = {"+", "-", "*"};

    public static void launchCalcGame() {
        String[][] result = new String[Util.ANSWERS][2];
        for (int i = 0; i != Util.COUNTER; i++) {
            int randomOperator = Util.getRandomNum(0, 2);
            int firstNum = Util.getRandomNum(Util.MIN_RANGE_RANDOM, Util.MAX_RANGE_RANDOM);
            int secondNum = Util.getRandomNum(Util.MIN_RANGE_RANDOM, Util.MAX_RANGE_RANDOM);
            result[i][0] = buildQuestion(firstNum, secondNum, OPERATOR[randomOperator]);
            result[i][1] = correctAnswer(firstNum, secondNum, randomOperator);
        }
        Engine.runEngine(result, RULES);
    }

    public static String buildQuestion(int firstNum, int secondNum, String operator) {
        return firstNum + " " + operator + " " + secondNum;
    }

    public static String correctAnswer(int firstNum, int secondNum, int randomOperator) {
        int resultOfExpression = 0;
        if (randomOperator == 0) {
            resultOfExpression = firstNum + secondNum;
        }
        if (randomOperator == 1) {
            resultOfExpression = firstNum - secondNum;
        }
        if (randomOperator == 2) {
            resultOfExpression = firstNum * secondNum;
        }
        return String.valueOf(resultOfExpression);
    }
}

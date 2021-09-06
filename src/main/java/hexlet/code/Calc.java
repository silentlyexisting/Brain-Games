package hexlet.code;

import java.util.Random;

public class Calc {
     private static Random random = new Random();

    public static String getRules() {
        return "What is the result of the expression?";
    }

    public static void launchCalcGame() {
        String[][] result = new String[3][2];
        for (int i = 0; i != 3; i++) {
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


        int[] firstRandomNum = Util.getRandomNum(1, 100, 1);
        int[] secondRandomNum = Util.getRandomNum(1, 100, 1);

        String stringFormOperation = firstRandomNum[0] + operator[getRandomOperator] + secondRandomNum[0];


        calcResult[0] = stringFormOperation;


        if (getRandomOperator == 0) {
            resultOfExpression = firstRandomNum[0] + secondRandomNum[0];
        }
        if (getRandomOperator == 1) {
            resultOfExpression = firstRandomNum[0] - secondRandomNum[0];
        }
        if (getRandomOperator == 2) {
            resultOfExpression = firstRandomNum[0] * secondRandomNum[0];
        }

        calcResult[1] = String.valueOf(resultOfExpression);
        return calcResult;
    }
}

package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    private static final int COUNTER = 3;
    private static final int ANSWERS = 3;

    public static String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static void launchEvenGame() {
        String[][] result = new String[ANSWERS][2];

        for (int i = 0; i != COUNTER; i++) {
            String[] temp = evenGame();
            result[i][0] = temp[0];
            result[i][1] = temp[1];
        }

        Engine.gameEngine(result, getRules());

    }


    public static String[] evenGame() {
        String[] resultEven = new String[2];

        int[] randomNumForEven = Util.getRandomNum(Util.MIN_RANGE_RANDOM, Util.MAX_RANGE_RANDOM, Util.AMMOUNT_OF_RANDOM_NUMS);


        if (randomNumForEven[0] % 2 == 0) {
            resultEven[1] = "yes";
        } else if (randomNumForEven[0] % 2 != 0) {
            resultEven[1] = "no";
        }

        resultEven[0] = String.valueOf(randomNumForEven[0]);
        return resultEven;
    }
}


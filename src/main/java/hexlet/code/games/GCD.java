package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    public static String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static void launchGcdGame() {
        String[][] result = new String[Util.ANSWERS][2];
        for (int i = 0; i < Util.COUNTER; i++) {
            String[] temp = getGcd();
            result[i][0] = temp[0];
            result[i][1] = temp[1];
        }
        Engine.gameEngine(result, getRules());
    }

    public static String[] getGcd() {
        String[] gcdResult = new String[2];

        int[] randomNum = Util.getRandomNum(Util.MIN_RANGE_RANDOM, Util.MAX_RANGE_RANDOM, Util.AMMOUNT_OF_RANDOM_NUMS2);

        gcdResult[0] = randomNum[0] + " " + randomNum[1];

        while (randomNum[0] != randomNum[1]) {
            if (randomNum[0] > randomNum[1]) {
                randomNum[0] = randomNum[0] - randomNum[1];
                gcdResult[1] = String.valueOf(randomNum[0]);
            } else {
                randomNum[1] = randomNum[1] - randomNum[0];
                gcdResult[1] = String.valueOf(randomNum[1]);
            }
        }
        return gcdResult;
    }
}

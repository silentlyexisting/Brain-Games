package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    public static String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static void launchPrimeGame() {
        String[][] result = new String[Util.ANSWERS][2];
        for (int i = 0; i != Util.COUNTER; i++) {
            String[] temp = prime();
            result[i][0] = temp[0];
            result[i][1] = temp[1];
        }
        Engine.gameEngine(result, getRules());
    }

    public static String[] prime() {
        String[] resultPrime = new String[2];

        int[] randomNumForPrime = Util.getRandomNum(Util.MIN_RANGE_RANDOM, Util.MAX_RANGE_RANDOM,
                Util.AMMOUNT_OF_RANDOM_NUMS);
        int i = 2;
        boolean checkPrime = false;
        while (i <= randomNumForPrime[0] / 2) {
            if (randomNumForPrime[0] % i  == 0) {
                checkPrime = true;
                break;
            }
            i++;
        }
        resultPrime[0] = String.valueOf(randomNumForPrime[0]);
        if (!checkPrime) {
            resultPrime[1] = "yes";
        } else {
            resultPrime[1] = "no";
        }
        return resultPrime;
    }
}

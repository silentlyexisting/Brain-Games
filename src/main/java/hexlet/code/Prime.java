package hexlet.code;

import java.util.Scanner;

public class Prime {
    private static final int MIN_RANGE_RANDOM = 1;
    private static final int MAX_RANGE_RANDOM = 103;
    private static final int AMMOUNT_OF_RANDOM_NUMS = 1;
    private static final int COUNTER = 3;
    private static final int ANSWERS = 3;

    public static String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static void launchPrimeGame() {
        String[][] result = new String[ANSWERS][2];
        for (int i = 0; i != COUNTER; i++) {
            String[] temp = prime();
            result[i][0] = temp[0];
            result[i][1] = temp[1];
        }
        Engine.gameEngine(result, getRules());

    }

    public static String[] prime() {
        Scanner scanner = new Scanner(System.in);
        String[] resultPrime = new String[2];

        int[] randomNumForPrime = Util.getRandomNum(MIN_RANGE_RANDOM, MAX_RANGE_RANDOM, AMMOUNT_OF_RANDOM_NUMS);
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

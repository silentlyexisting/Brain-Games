package hexlet.code;

import java.util.Scanner;

public class Prime {

    public static String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static void launchPrimeGame() {
        String[][] result = new String[3][2];
        for (int i = 0; i != 3; i++) {
            String[] temp = prime();
            result[i][0] = temp[0];
            result[i][1] = temp[1];
        }
        Engine.gameEngine(result, getRules());

    }

    public static String[] prime() {
        Scanner scanner = new Scanner(System.in);
        String[] resultPrime = new String[2];

        int[] randomNumForPrime = Util.getRandomNum(1, 103, 1);
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

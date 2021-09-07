package hexlet.code;

public class GCD {
    private static final int MIN_RANGE_RANDOM = 1;
    private static final int MAX_RANGE_RANDOM = 100;
    private static final int AMMOUNT_OF_RANDOM_NUMS = 2;
    private static final int COUNTER = 3;
    private static final int ANSWERS = 3;

    public static String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static void launchGcdGame() {
        String[][] result = new String[ANSWERS][2];
        for (int i = 0; i < COUNTER; i++) {
            String[] temp = getGcd();
            result[i][0] = temp[0];
            result[i][1] = temp[1];
        }
        Engine.gameEngine(result, getRules());
    }

    public static String[] getGcd() {
        String[] gcdResult = new String[2];

        int[] randomNum = Util.getRandomNum(MIN_RANGE_RANDOM, MAX_RANGE_RANDOM, AMMOUNT_OF_RANDOM_NUMS);

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

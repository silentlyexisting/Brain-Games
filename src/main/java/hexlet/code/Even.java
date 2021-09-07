package hexlet.code;


public class Even {
    private static final int MIN_RANGE_RANDOM = 1;
    private static final int MAX_RANGE_RANDOM = 100;
    private static final int AMMOUNT_OF_RANDOM_NUMS = 1;
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

        int[] randomNumForEven = Util.getRandomNum(MIN_RANGE_RANDOM, MAX_RANGE_RANDOM, AMMOUNT_OF_RANDOM_NUMS);


        if (randomNumForEven[0] % 2 == 0) {
            resultEven[1] = "yes";
        } else if (randomNumForEven[0] % 2 != 0) {
            resultEven[1] = "no";
        }

        resultEven[0] = String.valueOf(randomNumForEven[0]);
        return resultEven;
    }
}


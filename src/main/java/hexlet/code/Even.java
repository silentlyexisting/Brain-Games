package hexlet.code;


public class Even {
    public static String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static void launchEvenGame() {
        String[][] result = new String[3][2];

        for (int i = 0; i != 3; i++) {
            String[] temp = evenGame();
            result[i][0] = temp[0];
            result[i][1] = temp[1];
        }

        Engine.gameEngine(result, getRules());

    }


    public static String[] evenGame() {
        String[] resultEven = new String[2];

        int[] randomNumForEven = Util.getRandomNum(1, 100, 1);


        if (randomNumForEven[0] % 2 == 0) {
            resultEven[1] = "yes";
        } else if (randomNumForEven[0] % 2 != 0) {
            resultEven[1] = "no";
        }

        resultEven[0] = String.valueOf(randomNumForEven[0]);
        return resultEven;
    }
}


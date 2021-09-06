package hexlet.code;

public class GCD {

    public static String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static void launchGcdGame() {
        String[][] result = new String[3][2];
        for (int i = 0; i < 3; i++) {
            String[] temp = getGcd();
            result[i][0] = temp[0];
            result[i][1] = temp[1];
        }
        Engine.gameEngine(result, getRules());

    }


    public static String[] getGcd() {
        String[] gcdResult = new String[2];

        int[] randomNum1 = Util.getRandomNum(1, 100, 1);
        int[] randomNum2 = Util.getRandomNum(1, 100, 1);


        gcdResult[0] = randomNum1[0] + " " + randomNum2[0];

        while (randomNum1[0] != randomNum2[0]) {
            if (randomNum1[0] > randomNum2[0]) {
                randomNum1[0] = randomNum1[0] - randomNum2[0];
                gcdResult[1] = String.valueOf(randomNum1[0]);;
            } else {
                randomNum2[0] = randomNum2[0] - randomNum1[0];
                gcdResult[1] = String.valueOf(randomNum2[0]);
            }
        }
        return gcdResult;
    }

}

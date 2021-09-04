package hexlet.code;

import java.util.Arrays;
import java.util.Scanner;



    public class Progression {
        private final static int progressionLength = 10;

        public static String getRules() {
            return  "What number is missing in the progression?";
        }

        public static void launchProgressionGame() {
            String[][] result = new String[3][2];
            for (int i = 0; i != 3; i++) {
                String[] temp = progression();
                result[i][0] = temp[0];
                result[i][1] = temp[1];
            }
            Engine.gameEngine(result, getRules());
        }

        public static String[] progression() {
            Scanner scanner = new Scanner(System.in);
            String[] progressionArray = new String[progressionLength];
            StringBuilder sb = new StringBuilder();
            String[] resultProgression = new String[2];

            int counter = 0;

            int[] firstNumOfProgression = Util.getRandomNum(1, 10, 1);

            int[] intervalProgression = Util.getRandomNum(1, 9, 1);

            for (int i = 0; i <= progressionLength - 1; i++) {
                firstNumOfProgression[0] += intervalProgression[0];
                progressionArray[i] = String.valueOf(firstNumOfProgression);

            }

            int[] randomIndex = Util.getRandomNum(1, 9, 1);
            String result = progressionArray[randomIndex[0]];
            progressionArray[randomIndex[0]] = "..";

            for (String s : progressionArray) {
                sb.append(s + " ");
            }
            System.out.println(Arrays.toString(progressionArray));
            resultProgression[0] = String.valueOf(sb);
            resultProgression[1] = result;
            return resultProgression;
        }
}

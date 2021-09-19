package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

    public class Progression {
        private static final int LENGTH_OF_PROGRESSION = 10;
        private static final int MAX_RANGE_RANDOM_NUM = 10;
        private static final int MAX_RANGE_RANDOM_INVERVAL_INDEX = 9;
        public static String getRules() {
            return  "What number is missing in the progression?";
        }

        public static void launchProgressionGame() {
            String[][] result = new String[Util.ANSWERS][2];
            for (int i = 0; i != Util.COUNTER; i++) {
                String[] temp = progression();
                result[i][0] = temp[0];
                result[i][1] = temp[1];
            }
            Engine.gameEngine(result, getRules());
        }

        public static String[] progression() {
            String[] progressionArray = new String[LENGTH_OF_PROGRESSION];
            StringBuilder sb = new StringBuilder();
            String[] resultProgression = new String[2];

            int[] firstNumOfProgression = Util.getRandomNum(Util.MIN_RANGE_RANDOM, MAX_RANGE_RANDOM_NUM,
                    Util.AMMOUNT_OF_RANDOM_NUMS);

            int[] intervalProgression = Util.getRandomNum(Util.MIN_RANGE_RANDOM, MAX_RANGE_RANDOM_INVERVAL_INDEX,
                    Util.AMMOUNT_OF_RANDOM_NUMS);

            for (int i = 0; i <= LENGTH_OF_PROGRESSION - 1; i++) {
                firstNumOfProgression[0] += intervalProgression[0];
                progressionArray[i] = String.valueOf(firstNumOfProgression[0]);
            }

            int[] randomIndex = Util.getRandomNum(Util.MIN_RANGE_RANDOM, MAX_RANGE_RANDOM_INVERVAL_INDEX,
                    Util.AMMOUNT_OF_RANDOM_NUMS);
            String result = progressionArray[randomIndex[0]];
            progressionArray[randomIndex[0]] = "..";

            for (String s : progressionArray) {
                sb.append(s + " ");
            }
            resultProgression[0] = String.valueOf(sb);
            resultProgression[1] = result;
            return resultProgression;
        }
}

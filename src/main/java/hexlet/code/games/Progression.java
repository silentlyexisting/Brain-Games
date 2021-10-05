package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

    public class Progression {
        private static final int LENGTH_OF_PROGRESSION = 10;
        private static final int MAX_RANGE_RANDOM_NUM = 10;
        private static final int MAX_RANGE_RANDOM_INVERVAL_INDEX = 9;
        private static final String RULES = "What number is missing in the progression?";

        public static void launchProgressionGame() {
            String[][] result = new String[Util.ANSWERS][2];
            for (int i = 0; i != Util.COUNTER; i++) {
                int firstNumOfProgression = Util.getRandomNum(Util.MIN_RANGE_RANDOM, MAX_RANGE_RANDOM_NUM);
                int intervalProgression = Util.getRandomNum(Util.MIN_RANGE_RANDOM, MAX_RANGE_RANDOM_INVERVAL_INDEX);
                int randomIndexNum = Util.getRandomNum(Util.MIN_RANGE_RANDOM, MAX_RANGE_RANDOM_INVERVAL_INDEX);
                String[] progression = generateProgression(firstNumOfProgression, intervalProgression);
                String resultNum = progression[randomIndexNum];
                result[i][0] = buildQuestion(progression, randomIndexNum);
                result[i][1] = resultNum;
            }
            Engine.runEngine(result, RULES);
        }

        public static String[] generateProgression(int firstNumOfProgression, int intervalProgression) {
            String[] progressionArray = new String[LENGTH_OF_PROGRESSION];
            for (int i = 0; i <= LENGTH_OF_PROGRESSION - 1; i++) {
                firstNumOfProgression += intervalProgression;
                progressionArray[i] = String.valueOf(firstNumOfProgression);
            }
            return progressionArray;
        }

        public static String buildQuestion(String[] generatedProgression, int randomIndex) {
            StringBuilder sb = new StringBuilder();
            generatedProgression[randomIndex] = "..";
            for (String s : generatedProgression) {
                sb.append(s + " ");
            }
            return String.valueOf(sb);
        }
}

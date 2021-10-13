package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

    public class Progression {
        private static final int LENGTH_OF_PROGRESSION = 10;
        private static final int MAX_RANGE_RANDOM_NUM = 10;
        private static final int MAX_RANGE_RANDOM_INVERVAL_INDEX = 9;
        private static final String RULES = "What number is missing in the progression?";

        public static void launchProgressionGame() {
            String[][] questionAndAnswer = new String[Util.ANSWERS][2];
            for (int i = 0; i != Util.COUNTER; i++) {
                int firstNumOfProgression = Util.getRandomNum(Util.MIN_RANGE_RANDOM, MAX_RANGE_RANDOM_NUM);
                int intervalProgression = Util.getRandomNum(Util.MIN_RANGE_RANDOM, MAX_RANGE_RANDOM_INVERVAL_INDEX);
                int indexToHide = Util.getRandomNum(Util.MIN_RANGE_RANDOM, MAX_RANGE_RANDOM_INVERVAL_INDEX);
                String[] progression = generateProgression(firstNumOfProgression, intervalProgression);
                String missedNumber = progression[indexToHide];
                questionAndAnswer[i][0] = buildQuestion(progression, indexToHide);
                questionAndAnswer[i][1] = missedNumber;
            }
            Engine.runEngine(questionAndAnswer, RULES);
        }

        public static String[] generateProgression(int firstNumOfProgression, int intervalProgression) {
            String[] progression = new String[LENGTH_OF_PROGRESSION];
            for (int i = 0; i <= LENGTH_OF_PROGRESSION - 1; i++) {
                firstNumOfProgression += intervalProgression;
                progression[i] = String.valueOf(firstNumOfProgression);
            }
            return progression;
        }

        public static String buildQuestion(String[] generatedProgression, int indexToHide) {
            StringBuilder sb = new StringBuilder();
            generatedProgression[indexToHide] = "..";
            for (String s : generatedProgression) {
                sb.append(s + " ");
            }
            return String.valueOf(sb);
        }
}

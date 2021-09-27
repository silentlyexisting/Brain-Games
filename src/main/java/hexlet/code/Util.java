package hexlet.code;

public class Util {
    public static final int MIN_RANGE_RANDOM = 1;
    public static final int MAX_RANGE_RANDOM = 100;
    public static final int COUNTER = 3;
    public static final int ANSWERS = 3;
    public static int getRandomNum(int minRange, int maxRange) {
        return minRange + (int) (Math.random() * maxRange);
    }

    public static String questionNumToString(int questionNum) {
        return String.valueOf(questionNum);
    }
}

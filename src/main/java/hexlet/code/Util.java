package hexlet.code;

public class Util {
    public static final int MIN_RANGE_RANDOM = 1;
    public static final int MAX_RANGE_RANDOM = 100;
    public static final int AMMOUNT_OF_RANDOM_NUMS = 1;
    public static final int AMMOUNT_OF_RANDOM_NUMS2 = 2;
    public static final int COUNTER = 3;
    public static final int ANSWERS = 3;
    public static int[] getRandomNum(int minRange, int maxRange, int ammountOfNums) {
        int[] randomNums = new int[ammountOfNums];
        for (int i = 0; i != ammountOfNums; i++) {
            randomNums[i] = minRange + (int) (Math.random() * maxRange);
        }
        return randomNums;
    }
}

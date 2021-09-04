package hexlet.code;

public class Util {

    public static int[] getRandomNum(int minRange, int maxRange, int ammountOfNums) {
        int[] randomNums = new int[ammountOfNums];
        for (int i = 0; i != ammountOfNums; i++) {
            randomNums[i] = minRange + (int) (Math.random() * maxRange);
        }
        return randomNums;
    }
}

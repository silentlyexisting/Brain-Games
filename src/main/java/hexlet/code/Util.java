package hexlet.code;

public class Util {
    private final static int minRange = 1;
    private final static int maxRangeOf20 = 20;
    private final static int maxRangeForEven = 100;
    public static int getRandomNum() {
        int randomNum = (int) Math.floor(Math.random() * (maxRangeOf20 - minRange + 1) + minRange);
        return randomNum;
    }
}

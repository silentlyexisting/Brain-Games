package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Engine {
    private final static int minRange = 1;
    private final static int maxRangeForCalc = 20;
    private final static int maxxRangeForEven = 100;
    public final static int ammountOfRounds = 3;



    public static int getRandomNum() {
        int randomNum = (int) Math.floor(Math.random() * (maxxRangeForEven - minRange + 1) + minRange);
        return randomNum;
    }



}
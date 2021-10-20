package hexlet.code;

import java.util.Random;

public class Utils {

    public static final int START_RANGE = 0;
    public static final int END_RANGE = 100;

    public static int getRandomIntInRange(int startRange, int endRange) {
        int diff = endRange - startRange;
        Random random = new Random();
        return random.nextInt(diff + 1) + startRange;
    }
}

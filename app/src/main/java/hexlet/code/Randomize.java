package hexlet.code;

import java.util.Random;

public class Randomize {
    public static int generateNum() {
        int min = 1;
        int max = 10000;
        int random = (int) Math.floor(Math.random()*(max-min+1) + min);
        return random;
    }
}

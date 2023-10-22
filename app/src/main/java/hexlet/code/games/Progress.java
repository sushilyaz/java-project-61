package hexlet.code.games;

import hexlet.code.Const;
import hexlet.code.Engine;
import hexlet.code.Randomize;

public class Progress {
    public static void gameProgress() {
        String name = Cli.greeting();
        System.out.println("""
                What number is missing in the progression?""");
        int lengthProgress = 0;
        String expression = "";
        String actually = "";
        String except = "";
        boolean check;
        int index = 0;
        for (int i = 0; i < Const.COUNT_OF_QUESTION; i++) {
            lengthProgress = Randomize.generateNum(Const.MIN_SIDE_LENGTH, Const.MAX_SIDE_LENGTH);
            int[] seq = generateSeq(lengthProgress);
            index = Randomize.generateNum(Const.MIN_SIDE_INDEX, lengthProgress - 1);
            for (int j = 0; j < seq.length; j++) {
                if (j == index) {
                    expression = expression + ".." + " ";
                } else {
                    expression = expression + String.valueOf(seq[j]) + " ";
                }
            }
            Engine.generateQuastion(expression);
            expression = "";
            except = String.valueOf(seq[index]);
            actually = Engine.userAnswer();
            check = Engine.checkAnswer(except, actually);
            Engine.result(check, except, actually, name);
        }
        System.out.println("Congratulations, " + name + "!");
    }

    public static int[] generateSeq(int count) {
        int minSideLengthOfD = 1;
        int maxSideLengthOfD = 10;
        int[] randomSeq = new int[count];
        int d = 0;
        randomSeq[0] = Randomize.generateNum(Const.MIN_SIDE_INDEX, Const.MAX_SIDE_LENGTH_PROGRESS);
        d = Randomize.generateNum(minSideLengthOfD, maxSideLengthOfD);
        for (int i = 1; i < randomSeq.length; i++) {
            randomSeq[i] = randomSeq[0] + d * (i);
        }
        return randomSeq;
    }
}

package hexlet.code.games;

import hexlet.code.Const;
import hexlet.code.Engine;
import hexlet.code.Randomize;

public class Gcd {
    public static void ncdGame() {
        String name = Cli.greeting();
        System.out.println("""
                Find the greatest common divisor of given numbers.""");
        int num1 = 0;
        int num2 = 0;
        String expression = "";
        String actually = "";
        String except = "";
        boolean check;
        for (int i = 0; i < Const.COUNT_OF_QUESTION; i++) {
            num1 = Randomize.generateNum(1, Const.MAX_SIDE_INDEX);
            num2 = Randomize.generateNum(1, Const.MAX_SIDE_LENGTH_PROGRESS);
            expression = String.valueOf(num1) + " " + String.valueOf(num2);
            Engine.generateQuastion(expression);
            except = String.valueOf(calc(num1, num2));
            actually = Engine.userAnswer();
            check = Engine.checkAnswer(except, actually);
            Engine.result(check, except, actually, name);
        }
        System.out.println("Congratulations, " + name + "!");
    }

    public static int calc(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}

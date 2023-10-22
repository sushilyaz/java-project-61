package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Randomize;

import java.math.BigInteger;

public class Prime {
    public static void gamePrime() {
        String name = Cli.greeting();
        System.out.println("""
                Answer 'yes' if given number is prime. Otherwise answer 'no'.""");
        int num = 0;
        String expression = "";
        String actually = "";
        String except = "";
        boolean check;
        boolean probablePrime = true;
        for (int i = 0; i < 3; i++) {
            num = Randomize.generateNum(1, 100);
            expression = String.valueOf(num);
            Engine.generateQuastion(expression);
            BigInteger bigInteger = BigInteger.valueOf((Integer) num);
            probablePrime = bigInteger.isProbablePrime((int) Math.log((Integer) num));
            if (probablePrime) except = "yes";
            else except = "no";
            actually = Engine.userAnswer();
            check = Engine.checkAnswer(except, actually);
            Engine.result(check, except, actually, name);
        }
        System.out.println("Congratulations, " + name + "!");
    }
}

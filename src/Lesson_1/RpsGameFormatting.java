package Lesson_1;

import java.util.Random;

public class RpsGameFormatting {
    private static final String ROCK = "✊";
    private static final String SCISSORS = "✌️";
    private static final String PAPER = "✋";

    // Игра Камень-Ножницы-Бумага
    public static void main(String[] args) throws InterruptedException {

        // Ход первого игрока
        String name1 = "HEL";
        Random r = new Random();
        int position1 = r.nextInt(1, 100);
        String sign1 = ROCK;


        if (position1 > 66) {
            sign1 = PAPER;
        } else if (position1 > 33) {
            sign1 = SCISSORS;
        }


        System.out.println("Ход " + name1 + ": ");

        for (int i = 0; i < 5; i++) {
            System.out.print(ROCK + "\r");
            Thread.sleep(100);
            System.out.print(SCISSORS + "\r");
            Thread.sleep(100);
            System.out.print(PAPER + "\r");
            Thread.sleep(100);
        }

        System.out.println(sign1);


        // Ход второго игрока
        String name2 = "WALLE";
        int position2 = r.nextInt(1, 100);
        String sign2 = ROCK;


        if (position2 > 66) {
            sign2 = PAPER;
        } else {
            if (position2 > 33) {
                sign2 = SCISSORS;
            }
        }

        System.out.println("Ход " + name2 + ": ");

        for (int i = 0; i < 5; i++) {
            System.out.print(ROCK + "\r");
            Thread.sleep(100);
            System.out.print(SCISSORS + "\r");
            Thread.sleep(100);
            System.out.print(PAPER + "\r");
            Thread.sleep(100);
        }

        System.out.println(sign2);


        if (sign1.equals(sign2)) {
            System.out.println("Победила дружба!");
            return;
        }


        boolean isEqualName1 = sign1.equals(ROCK) && sign2.equals(SCISSORS) ||
                sign1.equals(SCISSORS) && sign2.equals(PAPER) ||
                sign1.equals(PAPER) && sign2.equals(ROCK);

        if (isEqualName1) {
            System.out.println("\nПобедил - " + name1);
        } else {
            System.out.println("\nПобедил - " + name2);
        }
    }


}

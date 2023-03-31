package com.guramee;

import java.util.Scanner;

public class GuessingGame {
    //Var
    static Scanner scanner = new Scanner(System.in);
    static int range;
    static int answer;
    static int input = 0;

    static int randomAnswer() {
        return (int) (Math.random()*range);
    }

    public static void main(String[] args) {
        System.out.print("Input the range:\n");
        range = scanner.nextInt();
        answer = randomAnswer();
        System.out.println(answer);

        while (input != answer) {
            System.out.print("Guess a number between 1 to " + range + " : ");
            input = scanner.nextInt();
            if (input < answer / 2)
                System.out.println("Too low!");
            else if (input < answer)
                System.out.println("A bit low!");
            else if (input > answer + (answer / 2))
                System.out.println("Too high!");
            else if (input > answer)
                System.out.println("A bit high!");
        }
        System.out.println("Good Job! The answer is " + answer);
    }
}

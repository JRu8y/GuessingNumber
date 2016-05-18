package io.dimitrivaughn;

import java.util.Scanner;

/**
 * Created by dimitrivaughn on 4/28/16.
 */


public class Game {
    private int count = 0;
    private boolean correct = false;
    private int guess;
    private int secret = 5;



    Scanner scanner = new Scanner(System.in);

    public int requestPlayerInput(){
        System.out.println("Guess a number: ");
        guess = scanner.nextInt();
        return guess;
    }

    public void compare(){
    while(!correct) {
        int lastGuess = guess;
        if (lastGuess < secret) {
            count++;
            System.out.println("You have guessed " + count + " times.");
            System.out.println("Guess is too low, guess again: ");
            guess = scanner.nextInt();
        } else if (guess > secret) {
            count++;
            System.out.println("You have guessed " + count + " times.");
            System.out.println("Guess is too high, guess again: ");
            guess = scanner.nextInt();
        } else if (guess == secret) {
            correct = true;
            count++;
            System.out.println("You have guessed " + count + " times.");
            System.out.println("You win!");
        }
    }
    }
}




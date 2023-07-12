package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int user = 0;
        int userWins = 0;

        System.out.println(" ROCK, PAPER, SCISSORS");
        System.out.println("========================");

        System.out.println("How many rounds you wish to play?");
        int rounds = sc.nextInt();

        System.out.println("OK! LET'S PLAY!!");

        for (int counter = 0; counter < rounds; counter++) {
            System.out.println("Choose a number 1. ROCK 2. PAPER 3. SCISSORS");

            user = sc.nextInt();

            while(user < 1 || user > 3){
                System.out.println("Choose a number 1. ROCK 2. PAPER 3. SCISSORS");

                user = sc.nextInt();
            }

            int computer = rand.nextInt(1, 3) + 1;

            if (user == computer) {
                System.out.println("TIE!");
            } else if (user == 1 && computer == 3 || user == 3 && computer == 2 || user == 2 && computer == 1) {
                System.out.println("WON!");
                userWins++;
            } else if (user == 3 && computer == 1 || user == 2 && computer == 3 || user == 1 && computer == 2) {
                System.out.println("LOST! You chose " + user + ". Player 2 chose " + computer + ".");
            }
        }

        System.out.println("You won " + userWins + "/" + rounds + ".");
    }
}
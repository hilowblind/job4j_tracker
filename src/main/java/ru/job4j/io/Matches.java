package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amountOfMatches = 11;
        int player = 1;
        System.out.println("Welcome to our game! Take matches in turn");
        while (amountOfMatches > 0) {
            System.out.println("Player " + player + " , your turn to take matches. How many do you want to take?");
            int select = Integer.valueOf(input.nextLine());
            while (select < 1 || select > 3) {
                System.out.println("You entered incorrect number. Try again:");
                select = Integer.valueOf(input.nextLine());
            }
            amountOfMatches -= select;
            if (amountOfMatches <= 0) {
                break;
            }
            System.out.println("You took " + select + " matches. There are only " +
                    amountOfMatches + " matches left");
            if (player == 1) {
                player++;
            } else {
                player--;
            }
        }
        System.out.println("Congratulations, player " + player + ", you won!");
    }
}


package JavaTutorial.LogicalOperators;

import java.util.Scanner;

public class logicalOperators {

    public static void main(String[] args) {

        /*
         * logical operators = used to connect two or more expressions
         * 
         * && = (AND) both conditions must be true
         * || = (OR) one condition must be met
         * ! = (NOT) reverse boolean value of a condition
         * 
         */

        // *** AND OPERATOR ***
        // int temp = 25;

        // if(temp > 30) {
        // System.out.println("It is hot outside");
        // }
        // else if (temp >= 20 && temp <= 30){
        // System.out.println("It is warm outside");
        // }
        // else {
        // System.out.println("It is cold outside");
        // }

        // *** OR OPERATOR ***
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("You are playing a game! Press q or Q to quit");

        // String response = scanner.next();

        // if(response.equals("q") || response.equals("Q")) {
        // System.out.println("You quit the game");
        // }
        // else {
        // System.out.println("You are still playing the game");
        // }

        // *** NOT OPERATOR ***
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");

        String response = scanner.next();

        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("You are still playing the game");
        } else {
            System.out.println("You quit the game");
        }

        scanner.close();
    }
}

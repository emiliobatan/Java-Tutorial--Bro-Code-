package JavaTutorial.Conditionals;

import java.util.Scanner;

public class If_Statements {
    public static void main(String[] args) {

        // if statement = performs a block of code if it's condition evaluates to be
        // true

        int age = 18;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you? ");
        int userAge = scanner.nextInt();

        if (userAge >= age) {
            System.out.println("You may drink");
        } else {
            System.out.println("You cant drink yet");
        }

        scanner.close();
    }
}

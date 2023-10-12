package JavaTutorial.MathClass;

import java.util.Scanner;

// Lets find the hypotenuse of a triangle
// Given 'A' and 'B' lets find length of side 'c'

public class findMissingSide {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Enter length a: ");
        a = scanner.nextDouble();

        System.out.println("Enter length b: ");
        b = scanner.nextDouble();

        c = Math.sqrt((a * a) + (b * b));

        System.out.println("Length of hypotenuse equals: " + c);

        scanner.close();
    }
}

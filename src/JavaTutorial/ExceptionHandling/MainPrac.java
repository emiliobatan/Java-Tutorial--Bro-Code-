package JavaTutorial.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainPrac {
    public static void main(String[] args) {

        /*
         * Exception: an event that occurs during the execution of a program that,
         * disrupts the normal flow of instructions
         * 
         * ** Unexpected events that will stop your program
         */

        Scanner scanner = new Scanner(System.in); 
        try {
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("result " + z);
            
        } catch (ArithmeticException e) {
            System.out.println("You cant divide by 0! ");
        } 
        catch(InputMismatchException e){
            System.out.println("Please enter a number!");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally {
            scanner.close();
        }

        // Finally block:   Will always execute no matter what 
        //             Whether or not a catch has been prompted
        // Normally used to close scanners, or files that may be open


    }
}

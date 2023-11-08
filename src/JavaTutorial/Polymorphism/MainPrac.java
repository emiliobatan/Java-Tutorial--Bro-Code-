package JavaTutorial.Polymorphism;

// import java.util.Arrays;
import java.util.Scanner;

public class MainPrac {
    public static void main(String[] args) {
        
        /*
         *  Polymorphism:   greek word for poly - "many", morph- "form"
         *                  The ability of an object to identify as more than one type
         * 
         */

        // Car car = new Car();
        // Bicycle bicycle = new Bicycle();
        // Boat boat = new Boat();

        // Vehicle[] racers = {car, bicycle, boat};

        // // car.go();
        // // bicycle.go();
        // // boat.go();

        // for (Vehicle racer : racers){
        //     racer.go();
        // }

        /*
            Polymorphism:   many shapes/forms
         *  Dynamic:    after compilation (during runtime)
         * 
         *  ex: A corvettes is a: corvette, and a car, a vehicle, and an object
         */

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want?");
        System.out.print("(1 = Dog) or (2 = cat): ");

        int choice = scanner.nextInt();

        if(choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choice == 2){
            animal = new Cat();
            animal.speak();
        } else {
            animal = new Animal();
            System.out.println("That choice was invalid");
            animal.speak();
        }
        scanner.close();
    }
}

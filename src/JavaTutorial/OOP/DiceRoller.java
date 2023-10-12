package JavaTutorial.OOP;

import java.util.Random;

public class DiceRoller {
    // Class attributes
    Random random;
    int number;

    // Constructor
    DiceRoller() {
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }

}

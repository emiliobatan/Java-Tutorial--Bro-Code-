package JavaTutorial.RandomValues;

import java.util.Random;

public class randomNums {

    public static void main(String[] args) {

        Random random = new Random();

        // random.nextInt will give value between 1-2 billion
        // int x = random.nextInt(7);

        // random.Double will give value between zero and one
        // double y = random.nextDouble();

        // random.nextBoolean will give either true or false
        boolean z = random.nextBoolean();

        System.out.println(z);
    }
}

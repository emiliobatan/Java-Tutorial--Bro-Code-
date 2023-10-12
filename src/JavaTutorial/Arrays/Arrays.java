package JavaTutorial.Arrays;

public class Arrays {
    public static void main(String[] args) {

        // array = used to store multiple values in a single variable
        // Arrays can be only hold the assigned value of elements when first initialized

        // String[] cars = new String[4]
        // cars[0] = "camaro";
        // cars[1] = "Porsche"

        String[] cars = { "Camaro", "Porsche", "Corvette", "Tesla" };

        // String firstCar = cars[0];

        // System.out.println(firstCar);

        /*
         *** If we want to see all of the elements within an array
         * we need to use a for loop ***
         */

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}

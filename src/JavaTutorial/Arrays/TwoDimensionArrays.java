package JavaTutorial.Arrays;

public class TwoDimensionArrays {
    public static void main(String[] args) {

        // 2D array = an array of arrays

        String[][] cars = {
                { "Camaro", "Corvette", "Silverado" },
                { "Mustang", "Porsche", "Ranger" },
                { "Ferrari", "Lambo", "Tesla" }
        };

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) { // cars[0][0]
                System.out.println(cars[i][j] + " ");
            }
        }
    }
}

package JavaTutorial.Loops;

import java.util.ArrayList;

public class forEachLoops {

    public static void main(String[] args) {

        /*
         * forEach : traversing technique to iterate through the elements in an
         * array/collection
         * less steps, more readable
         * less flexible
         */

        // String[] animals = {"dog", "cat", "rat", "bird"};

        ArrayList<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("bird");
        animals.add("shark");

        // for each (data type), element in array (animals)
        // execute code

        for (String animal : animals) {
            System.out.println(animal);
        }

    }
}

package JavaTutorial.Arrays;

import java.util.ArrayList;

public class ArrayListPrac {
    public static void main(String[] args) {

        /*
         * Arraylist: a resizeable array.
         * Elements can be added and removed after compilation phase
         * Store reference data types
         */

        ArrayList<String> food = new ArrayList<>();

        food.add("pizza");
        food.add("sushi");
        food.add("wings");
        food.add("tacos");

        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        } 
    }
}

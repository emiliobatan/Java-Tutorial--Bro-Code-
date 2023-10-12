package JavaTutorial.Arrays;

import java.util.ArrayList;

// 2D ArrayLists = a dynamic list of lists
// You can change the size of these lists during runtime

public class MultiDimensionalArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("doughnuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("red wine");
        drinkList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        // System.out.println(bakeryList);
        // System.out.println(bakeryList.get(0));

        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(2).get(1));

    }
}

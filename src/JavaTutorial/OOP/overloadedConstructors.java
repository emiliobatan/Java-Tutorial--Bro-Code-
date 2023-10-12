package JavaTutorial.OOP;

/*
 *  overloaded constructors:    multiple constructors within a class with the same name, 
 *                              but have different parameters 
 *                              name + parameters = signature 
 */

public class overloadedConstructors {
    
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Thin crust", "White sauce", "Mozzarella", "Chicken");

        System.out.println("These are the ingredients on your pizza: ");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.topping);
    }


}

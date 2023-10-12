package JavaTutorial.OOP;

public class Pizza {
    // Class attributes
    String bread;
    String sauce;
    String cheese;
    String topping;
    
    // Constructor
    Pizza(String bread, String sauce, String cheese, String topping){
        this.bread = bread;
        this.cheese = cheese;
        this.sauce = sauce;
        this.topping = topping;
    }

    // Overloaded Constructors

    // Pizza without a topping (Cheese only)
    Pizza(String bread, String sauce, String cheese){
        this.bread = bread;
        this.cheese = cheese;
        this.sauce = sauce;
    }

    // Pizza without cheese (Vegan)
    Pizza(String bread, String sauce){
        this.bread = bread;
        this.sauce = sauce;
    }

    // Pizza thats should just be called bread
    Pizza(String bread){
        this.bread = bread;
    }

    // Methods 
    
}

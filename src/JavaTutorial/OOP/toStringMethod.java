package JavaTutorial.OOP;

public class toStringMethod {
    
    /**
     *  toString(): special method that all objects inherit,
     *              that returns a string that "textually represents" an object
     *              can be used both implicitly and explicitly
     */

    public static void main(String[] args) {
        
        // toString method Practice on Objects 

        car Car = new car();
        
        System.out.println(Car.toString());

        System.out.println(Car);
    }
}

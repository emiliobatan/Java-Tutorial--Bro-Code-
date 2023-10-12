package JavaTutorial.MathClass;

public class mathPrac {
    public static void main(String[] args) {

        double x = 3.14;
        double y = -10;

        // Math.max will find the biggest number between the two numbers given within
        // the method
        double z = Math.max(x, y);

        // Math.min will show the smallest number between the two in the method
        double a = Math.min(x, y);

        // Math.abs will show the absolute value of a value inputted
        double b = Math.abs(y);

        // Math.sqrt will show square root of number inputted
        double c = Math.sqrt(81);

        // Math.pow will give you the number inputted to the power
        double p = Math.pow(5, 2);

        // Math.round will round inputted number
        double r = Math.round(x);

        // Math.ceil will always round up
        // Math.floor will always round down

        System.out.println("Biggest num: " + z);
        System.out.println("Smallest num: " + a);
        System.out.println("Absolute value: " + b);
        System.out.println("Square root: " + c);
        System.out.println("Power of: " + p);
        System.out.println("Rounded x: " + r);
    }
}

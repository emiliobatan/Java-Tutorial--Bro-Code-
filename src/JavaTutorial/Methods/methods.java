package JavaTutorial.Methods;

public class methods {
    public static void main(String[] args) {

        // method: a block of code that is executed whenever it is called upon

        int x = 3;
        int y = 4;

        System.out.println("Added " + x + ", " + y + " equals " + add(x, y));
        System.out.println("Subtracted " + x + ", " + y + " equals " + subtract(x, y));
        System.out.println("Multiplied " + x + ", " + y + " equals " + multiply(x, y));

        // hello();
    }

    // Add method
    static int add(int x, int y) {
        int z = x + y;
        return z;
    }

    // Subtract method
    static int subtract(int a, int b) {
        int z = a - b;

        return z;
    }

    // Multiply method
    static int multiply(int c, int d) {
        int z = c * d;

        return z;
    }

    // Hello method
    static void hello() {
        System.out.println("hello");
    }
}

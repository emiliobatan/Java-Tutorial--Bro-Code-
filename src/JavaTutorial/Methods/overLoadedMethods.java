package JavaTutorial.Methods;

public class overLoadedMethods {

    // overloaded methods: methods that share the same name but have different
    // parameters
    // method name + parameters = method signature
    // overloaded methods will look at how many arguments are passed into the method
    // as well as the data type that is entered

    public static void main(String[] args) {

        double x = add(5.0, 16.0, 19.0, 7.0);
        System.out.println(x);

    }

    // 1st add method (overloaded method)
    static int add(int a, int b) {
        System.out.println("This is overloaded method #1");
        return a + b;
    }

    // 2nd add method (overloaded method)
    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }

    // 3rd add method (overloaded method)
    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
    }

    // 4th add method (overloaded method)
    static double add(double a, double b) {
        System.out.println("This is overloaded method #4");
        return a + b;
    }

    // 5th add method (overloaded method)
    static double add(double a, double b, double c) {
        System.out.println("This is overloaded method #5");
        return a + b + c;
    }

    // 6th add method (overloaded method)
    static double add(double a, double b, double c, double d) {
        System.out.println("This is overloaded method #6");
        return a + b + c + d;
    }
}

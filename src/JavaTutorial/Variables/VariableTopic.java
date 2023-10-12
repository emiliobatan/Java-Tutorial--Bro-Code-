package JavaTutorial.Variables;

public class VariableTopic {
    public static void main(String[] args) {
        // int x = 25404020; // intialization
        // float y = 3.14f;
        // boolean z = false;
        // char symbol = '@';
        // String name = "Emilio";

        // System.out.println("My number is: " + x);
        // System.out.println(y);
        // System.out.println(z);
        // System.out.println(symbol);
        // System.out.println("My name is: " + name);

        // ****** Swap two variables ******

        String i  = "kaith";
        String j = "emilio";

        System.out.println("i: " +i);
        System.out.println("j: " +j);
        String temp;

        temp = i;
        i = j;
        j = temp;

        System.out.println("i: " +i);
        System.out.println("j: " +j);
    }
}

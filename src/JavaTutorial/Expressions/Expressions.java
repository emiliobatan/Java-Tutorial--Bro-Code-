package JavaTutorial.Expressions;

public class Expressions {

    public static void main(String[] args) {

        // expression = operands & operators
        // operands = values, variables, numbers, quantity
        // operators = + - * / %

        int friends = 10;

        friends = friends++;
        System.out.println(friends);

        // Since integers cannot hold decimals values
        // When dividing USE double as it will be able to store the decimal value

        double apples = 24;
        apples = apples / 7;
        System.out.println(apples);
    }
}

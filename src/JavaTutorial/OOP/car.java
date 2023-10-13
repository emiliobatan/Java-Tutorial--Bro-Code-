package JavaTutorial.OOP;

public class car {

    String make = "Porsche";
    String model = "Gt3rs";
    String color = "green";
    int year = 2023;

    public String toString(){
        return make + "\n" + model + "\n" + color + "\n" + year;
    }

    void brake() {
        System.out.println("you step on the breaks");
    }
}

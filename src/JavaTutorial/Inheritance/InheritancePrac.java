package JavaTutorial.Inheritance;

public class InheritancePrac {
    // inheritance: The process where one class acquires,
    //              the attributes and methods of another

    public static void main(String[] args) {
        Car car = new Car("Porsche");

        // car.go();

        Bicycle bike = new Bicycle();

        // bike.stop();

        // System.out.println(car.speed);
        // System.out.println(bike.speed);

        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }
}
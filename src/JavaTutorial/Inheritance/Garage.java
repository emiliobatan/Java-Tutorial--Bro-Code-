package JavaTutorial.Inheritance;

public class Garage {
    
    // Methods

    // The park method can only take in a car method
    void park(Car car){
        System.out.println("The " + car.name + " is parked in the garage");
    }
}

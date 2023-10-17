package JavaTutorial.OOP_Cont;

// With so many folders and files, this will be the main class for OOP_Cont

// You can pass objects as arguments to a method,
// But you when creating the method, it must take the 
// Object as a parameter (shown in garage class)

public class MakeShiftMainClass {
    
    public static void main(String[] args) {
        
        Garage garage = new Garage();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");

        garage.park(car1);

        garage.park(car2);
    }
}

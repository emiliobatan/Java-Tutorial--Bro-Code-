package JavaTutorial.Inheritance;

import JavaTutorial.OOP_Cont.Vehicle;

public class Car extends Vehicle{
    // Class attributes
    String name;
    int wheels = 4;
    int doors = 4;
    
    // Constructor 
    Car(String name){
        this.name = name;
    }
}

package JavaTutorial.OOP;

    // constructor: special method that is called when an object is instantiated (created)


public class Human {
    // Class attributes
    String name;
    int age;
    double weight; 

    // Creating a human constructor
    Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // METHODS
    void eat(){
        System.out.println(this.name + " is eating");
    }

    void dink() {
        System.out.println(this.name + " is drinking");
    }

}

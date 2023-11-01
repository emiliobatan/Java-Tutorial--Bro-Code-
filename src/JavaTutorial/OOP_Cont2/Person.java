package JavaTutorial.OOP_Cont2;

public class Person {
    // Class attributes
    String name;
    int age;

    // Constructor 
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

        // Method
        public String toString(){
            return this.name + "\n" + this.age + "\n";
        }
}

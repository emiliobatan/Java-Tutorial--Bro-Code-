package JavaTutorial.OOP_Cont2;

public class Dog extends Animal{
    

    // class method(s)

    // method overriding from animal class
    @Override // common practice to add this
    void speak(){
        System.out.println("The dog goes bark");
    }
}

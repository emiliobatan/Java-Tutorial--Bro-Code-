package JavaTutorial.OOP_Cont2;

public class Hero extends Person{
    // Class attributes 
    String power;

    //Constructor
    Hero(String name, int age, String power){
        super(name, age);
        this.power = power;
    }

    public String toString(){
        return super.toString() + this.power;
    }
}

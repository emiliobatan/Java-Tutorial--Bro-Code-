package JavaTutorial.OOP_Cont2;

public class SuperKeyword {
    // super :  keyword refers to the superclass (parent) of an object
    //          very similar to the "this" keyword

    public static void main(String[] args) {
        
        Hero hero1 = new Hero("Batman",42,"$$$");
        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);

        Hero hero2 = new Hero("Superman", 45, "flight");
        System.out.println(hero2.toString());
    }
}

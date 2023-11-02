package JavaTutorial.AcessModifiers.package1;
import  JavaTutorial.AcessModifiers.package2.*;

public class A {
    public static void main(String[] args) {
        
        // C c = new C();
        // System.out.println(c.publicMessage);

        // B b = new B();
        // System.out.println(b.private);
        // cannot be accessed because anything that is private will only be visible to the class it contains even if in the same package
    }

    // protected String protectedMessage = "This is protected";
}

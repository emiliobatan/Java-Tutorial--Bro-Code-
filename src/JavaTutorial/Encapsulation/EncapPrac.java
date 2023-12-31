package JavaTutorial.Encapsulation;

public class EncapPrac {
    /*
     *  Encapsulation : attributes of a class will be hidden or private, 
     *                  Can be accessed only through methods (getters & setters)
     *                  You should make attributes private if you don't have a reason to make them public/protected
     *  
     */

    public static void main(String[] args) {
        Car car = new Car("Subaru","Brz", 2016);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        car.setYear(2023);
        System.out.println(car.getYear());
    }
}

package JavaTutorial.WrapperClasses;

public class wrapperClasses {

    public static void main(String[] args) {

        /*
         * wrapper class = provides a way to use primitive data types as reference data
         * types
         * reference data types contain useful methods
         * can be used with collections (ex. ArrayList)
         * 
         * prmitive     *       wrapper
         * --------             -------
         * boolean      *       Boolean
         * char         *       Character
         * int          *       Integer
         * double       *       Double
         * 
         * 
         * autoboxing: the automatic conversion that the Java compiler makes between the
         * primitive types and their corresponding object wrapper class
         * unboxing: the reverse of autoboxing. Automatic conversion of wrapper class to
         * primitive
         */

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "emilio";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}

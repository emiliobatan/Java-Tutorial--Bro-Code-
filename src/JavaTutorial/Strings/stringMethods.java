package JavaTutorial.Strings;

public class stringMethods {

    /*
     * String: a reference data type that can store one or more characters
     * - reference data types have access to useful methods
     */

    public static void main(String[] args) {

        String name = "emilio";

        // boolean result = name.equalsIgnoreCase("bro");
        // System.out.println(result);

        // boolean sameName = name.equals("emilio");
        // System.out.println(sameName);

        // int length = name.length();

        // System.out.println(length);

        // char charAt = name.charAt(3);
        // System.out.println(charAt);

        // int result = name.indexOf("o");
        // System.out.println(result);

        // boolean result = name.isEmpty();
        // System.out.println(result);

        // String result = name.toUpperCase();
        // String result = name.toLowerCase();
        // System.out.println(result);

        // ** IF there is any white space in the string, it will get rid of it **
        // name = " Emilio " ==> "Emilio"
        // String result = name.trim();

        // *** replace will get rid of any instance of the first given parameter and
        // replace it with the 2nd param
        String result = name.replace("o", "a");
        System.out.println(result);
        
    }
}

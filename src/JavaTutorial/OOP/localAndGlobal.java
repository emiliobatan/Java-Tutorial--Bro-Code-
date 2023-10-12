package JavaTutorial.OOP;

/**
 *  local:  declared inside a method 
 *          visible only to that method
 * 
 *  global: declared outside a method, but within a class
 *          visible to all parts of a class
 */

public class localAndGlobal {
    public static void main(String[] args) {
        
        DiceRoller diceRoller = new DiceRoller();

        System.out.println(diceRoller);
    }
}

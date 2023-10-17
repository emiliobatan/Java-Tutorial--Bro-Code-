package JavaTutorial.OOP_Cont;

public class Friend {
    // Class attributes 
    String name;
    static int numberOfFriends;

    // Constructor
    Friend(String name){
        this.name = name;

        numberOfFriends++;
    }


    // Method(s)

    static void displayFriends(){
        System.out.println("You have " + numberOfFriends + " friends");
    }
}

package JavaTutorial.OOP_Cont;

import JavaTutorial.OOP.car;

public class StaticKeyword {
    
    // static = modifier. A single copy of a variable/method is created and shared.
    //          The class "owns" the static member


    public static void main(String[] args) {
        System.out.println(Friend.numberOfFriends);

        Friend friend1 = new Friend("Antonio");
        Friend friend2 = new Friend("Hector");
        Friend friend3 = new Friend("Tristan");
        Friend friend4 = new Friend("Joven");


        Friend.displayFriends();
    }
}

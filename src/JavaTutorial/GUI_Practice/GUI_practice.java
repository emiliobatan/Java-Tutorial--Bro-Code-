package JavaTutorial.GUI_Practice;

import javax.swing.JOptionPane;

public class GUI_practice {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        /*
         * To be able to use showInputDialog
         * MUST use INTEGER.parseInt
         */
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in inches"));
        JOptionPane.showMessageDialog(null, "You are " + height + " inches tall");
    }
}

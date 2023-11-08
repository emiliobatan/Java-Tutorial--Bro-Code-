package JavaTutorial.File;

import java.io.File;

public class MainPrac {
    public static void main(String[] args) {
        
        // file:    An abstract representation of file and directory path names

        // If file isnt within folder you can add the path name from your computer/laptop instead
        File file = new File("Java_bro_code_practice.txt");

        if(file.exists()){
            System.out.println("This file exists!");
            System.out.println(file.getPath());
            // This shows where the file is located in project
            System.out.println(file.getAbsolutePath());
            // This will show where the file is located on your computer
            System.out.println(file.isFile());
            // This will return true or false if file is a file 
            // file.delete();
            // This will delete file from the project
        } else {
            System.out.println("This file does not exit!");
        }
    }
}

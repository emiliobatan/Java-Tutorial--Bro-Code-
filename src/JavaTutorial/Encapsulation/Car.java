package JavaTutorial.Encapsulation;

public class Car {

    // Class attributes 
    private String make;
    private String model;
    private int year;

    //Constructor
    Car(String make, String model, int year){
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    // Getters and Setters 
    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    // Since we are changing the String we are returning anything which is why we use VOID
    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }
}
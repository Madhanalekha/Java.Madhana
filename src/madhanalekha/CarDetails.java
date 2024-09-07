/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package madhanalekha;
class Car {
    String model;
    int year;
    String color;
    double mileage;

   
    Car(String model, int year, String color, double mileage) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = mileage;
    }

    
    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Mileage: " + mileage + " miles\n");
        
    }

}

public class CarDetails {
     public static void main(String[] args) {
         System.out.println("Name:Madhanalekha L\nReg No:2303717710422026");
       
        Car car1 = new Car("Ford Mustang", 2021, "Black", 12500.5);
        Car car2 = new Car("BMW X5", 2019, "Silver", 30000.2);

        
        System.out.println("Details of Car 1:");
        car1.displayDetails();

        System.out.println("Details of Car 2:");
        car2.displayDetails();
    }
    
}

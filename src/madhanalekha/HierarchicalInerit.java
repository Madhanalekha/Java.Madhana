/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package madhanalekha;

/**
 *
 * @author madha
 */
class Food {
    String type;
    
    Food(String type) {
        this.type = type;
    }
    void display() {
        System.out.println("Food type: " + type);
    }
}

class Breakfast extends Food {
    String breakfastItem;
    Breakfast(String type, String breakfastItem) {
        super(type); 
        this.breakfastItem = breakfastItem;
    }
    void display() {
        super.display();
        System.out.println("Breakfast item: " + breakfastItem);
    }
}
class Lunch extends Food {
    String lunchItem;
    
    Lunch(String type, String lunchItem) {
        super(type); 
        this.lunchItem = lunchItem;
    }
    void display() {
        super.display(); 
        System.out.println("Lunch item: " + lunchItem);
    }
}
public class HierarchicalInerit {
    public static void main(String[] args) {
        System.out.println("Name:Madhanalekha L\nReg No:2303717710422026");
        Breakfast breakfast = new Breakfast("Morning Meal", "French Toast");
        breakfast.display(); 
        
        Lunch lunch = new Lunch("Midday Meal", "Biriyani");
        lunch.display(); 
    }
}

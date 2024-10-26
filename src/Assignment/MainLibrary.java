/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

/**
 *
 * @author madha
 */

interface Library {
  
    public void drawbook();
    public void returnbook(double fine);
    public void checkstatus();
    public void reservebook();
}
class LibraryImpl implements Library {
    private boolean isBookAvailable = true;
    private boolean isBookReserved = false;

    @Override
    public void drawbook() {
        if (isBookAvailable && !isBookReserved) {
            System.out.println("Book has been drawn (borrowed) successfully.");
            isBookAvailable = false;  
        } else if (isBookReserved) {
            System.out.println("Book is reserved by someone else. Cannot draw the book.");
        } else {
            System.out.println("Book is not available for drawing.");
        }
    }
    @Override
    public void returnbook(double fine) {
        if (fine > 0) {
            System.out.println("You have a fine of Rs. " + fine + ". Please pay the fine.");
        } else {
            System.out.println("Book returned successfully with no fine.");
        }
        isBookAvailable = true;  
    }

    @Override
    public void checkstatus() {
        if (isBookAvailable) {
            System.out.println("The book is available.");
        } else {
            System.out.println("The book is not available.");
        }
    }
    @Override
    public void reservebook() {
        if (isBookAvailable) {
            isBookReserved = true;  
            System.out.println("Book has been reserved.");
        } else {
            System.out.println("Book is not available for reservation.");
        }
    }
}

public class MainLibrary {
    
    public static void main(String[] args) {
       
        Library myLibrary = new LibraryImpl();       
        myLibrary.checkstatus();       
        myLibrary.reservebook();        
        myLibrary.drawbook();        
        myLibrary.checkstatus();       
        myLibrary.returnbook(50);        
        myLibrary.checkstatus();        
        myLibrary.reservebook();
    }
}



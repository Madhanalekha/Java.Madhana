/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package madhanalekha;

/**
 *
 * @author madha
 */
interface Reader {
    void read();
}

interface Writer {
    void write();
}

class Author implements Reader, Writer {
    private String name;
    private String genre;

    Author(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public void read() {
        System.out.println(name + " is reading a " + genre + " book.");
    }

    public void write() {
        System.out.println(name + " is writing a " + genre + " book.");
    }
}
public class MultipleInterface {
     public static void main(String[] args) {
        System.out.println("Name:Madhanalekha L\nReg No:2303717710422026");
        Author author = new Author("Alice", "science fiction");
        author.read();  
        author.write(); 
    }
}

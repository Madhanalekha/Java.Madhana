/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lekha;

/**
 *
 * @author madha
 */
class Box{
    int length;
    int breadth;
    int height;
    Box(){
        breadth=length=height=-1;
    }
    Box(int a){
        breadth=length=height=a;
    }
     void setDimention(int a, int b,int c){
        length = a;
        breadth = b;
        height = c;
    }
    Box(int a,int b, int c){
       length = a;
        breadth = b;
        height = c;
    }
    Box(Box b)//copy constructor
    {
        length =b.length;
        breadth =b.breadth;
        height =b.height;
    }
    public int volume(){
        return length*breadth*height;
    }
    boolean isEqual(Box b){
        if(length==b.length && breadth==b.breadth && height==b.height) 
            return true;
        else
            return false;
    }
    
}
public class PassingObject {
    public static void main( String[] args){
        Box black =new Box(30,4,5);
        black.setDimention(10,5,6);
        System.out.println("Vol of box is "+ black.volume());
        Box wooden=new Box(2,3,4);
        System.out.println(black.isEqual(wooden));
        Box b1=new Box(wooden);
        System.out.println(b1.length +","+ b1.breadth +","+ b1.height);
        
        
        
    }
}

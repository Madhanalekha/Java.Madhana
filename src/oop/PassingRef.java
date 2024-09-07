/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author madha
 */
class Box{
    int length;
    int breadth;
    int height;
     Box(int a,int b, int c)//it give the kheap storage
     {
       length = a;
        breadth = b;
        height = c;
    }
     Box doubleBox(){
         Box temp=new Box(2*length,2*breadth,2*height);
         return temp;
     }
     public int volume(){
        return length*breadth*height;
    }
     boolean isEqual(Box b){
         b.length++;
        if(length==b.length && breadth==b.breadth && height==b.height) 
            return true;
        else
            return false;
    }
}
public class PassingRef {
    
   /* static void increament( int a)//Call by value
    {
        a++;
    }
    public static void main(Sting[] args){
        int a;//it allocate the memory in stack
        increament(a);
        System.out.println(a);
    }*/
    public static void main(String[] args){
        Box b1=new Box(1,2,3);
        Box b2=new Box(1,2,3);
        System.out.println(b1.isEqual(b2));
        System.out.println(b2.length);//here the value of b2.length is changed because in the object we passing the refference address
        System.out.println(b2.volume());
        Box b3=b1.doubleBox();//returning the object by the method called doubleBox() which has the return type of Box that is the class name
        // here the refference of the temp object is sent by the methed,
        //and there isnot created a two heap memory for both temp and b3
        System.out.println(b3.length);
    }
}

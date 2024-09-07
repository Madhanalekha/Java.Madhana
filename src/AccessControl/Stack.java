/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccessControl;

/**
 *
 * @author madha
 */
public class Stack {
    private int s[]=new int[10];//private , public are the accesscontrol
     int tos;// default it was acceessed within the pacage
    Stack()
    {
        tos=-1;
    }
    void push(int item)
    {
        if(tos==s.length)
            System.out.println ( "Stack is full\n");
        else
            s[++tos]=item;
    }
    int pop(){
        if(tos>0)
            return s[tos--];
        else
            return 0;
    }
}


package oop;


abstract class Shape{
    abstract void area();
}
class Square extends Shape{
    int a;
    Square(int a){
        this.a=a;
    }
    void area(){
        System.out.println("Area of the square:"+ a*a);
    }
}
class Triangle extends Shape{
    int h,b;
    Triangle(int h,int b){
        this.h=h;
        this.b=b;
    }
    void area(){
        System.out.println("Area of triangle :"+ h*b/2);
    }
}
public class ShapeAbstract {
    public static void main(String[] args)
    {
        Square s1=new Square(2);
        s1.area();
        Triangle t1=new Triangle(4,5);
        t1.area();
        
        Shape[] s= new Shape[3];
        s[0]=t1;
        s[0].area();
        s[1]= s1;
        s[1].area();
        
    }
}

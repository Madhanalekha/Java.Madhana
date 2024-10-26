
package oop;


public class Objectclass {
    public static void main(String[] args)
    {
        String s1="Java";// it will store the default obj that is already exixt in inbuit String obj
        String s2="Java";
        String s3=new String("Java");// it will create a seperate obj for the string
        String s4=new String("Java");
        System.out.println(s1==s2);
        System.out.println(s3==s4);// it compares the obj reference is same are not 
        System.out.println(s2.equals(s3));// it compares the element stored in the object
    
    }
}
/*
Cosmic Super class
which is already exist 
s3==s4 it does not compare the same element exist or not it only compare the same obj or not
thats why it first give false
in s1 it store the java in string constant obj which is inbuit
if we want to compare the content use s2.equals(s3)
the equals method is wrten in the cosmic object which is used to compare the content of the obj
we can createe any obj for any class using => Object o=new Employee("ram",23000);

public boolean equals(Object obj){
    if(this=obj)
      return true;
if(obj==NULL)
      return false;
if(this.getClass() !=obj.getclass())
     return false;
Employee e=(Employee)obj;
 return this.name.equals(e.name)&& this.salary.equals(e.salary);
}


*/
package Basics;

public class StaticExample {

    static int a=10;//Static variable  fixed value
    int b=20;//Non Static variable
    

    static void  m1() //Satic Method
    {    
         StaticExample se=new  StaticExample();
         System.out.println("This is the m1 - static Method");
    }
    void m2() //Non Satic Method
    {
        System.out.println("This is the  m2 -non static Method");
    }

    void m3() //Non Satic Method
    {
        //Non static method can access both static and non static stuff direct
        System.out.println("Value of a= "+a);
        System.out.println("Value of b= "+b);
        m1();
        m2();
    }


    public static void main(String[] args) {
        
        //Static method can access only static stuff directly or access without any object there is no object required
        System.out.println(a);
        m1();
        //if static method/variable is another class the call by class name
        StaticExample.m1();

       // System.out.println(b);incorrect.because b is non static variable
       //m2();incorrect.because m2 is non static method
        
       StaticExample stat=new StaticExample();
       System.out.println(stat.b);
       stat.m2();
       stat.m3();
    
    
    }
    
}

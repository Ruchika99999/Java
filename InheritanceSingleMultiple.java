package Inheritance;


class A{  //A is Parent class
    int a;
    void display(){
        System.out.println("Values of a= "+a);
    }
}

class B extends A{   // B is Child class of A class
    int b;
    void print(){
        System.out.println("Values of b= "+b);
    }
}

class C extends B{   // B is Child class of A class
    int c;
    void show(){
        System.out.println("Values of c= "+c);
    }
}
public class InheritanceSingleMultiple {
    public static void main(String[] args) {
       A obj=new A();
       obj.a=10;
       obj.display();
       
       B obj1=new B();
       obj1.b=10;
       obj1.a=80;

       obj1.display();//A
       obj1.print();//B

       C obj2=new C();
       obj2.a=100;
       obj2.b=200;
       obj2.c=300;
       obj2.display();//A
       obj2.print();
       obj2.show();
    }
    
}

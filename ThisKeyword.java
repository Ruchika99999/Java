package Basics;

public class ThisKeyword {
    int a,b;//instance variable or class variables

    // void getValues(int a,int b)//Method Variables/External Variables
    // {
    //     this.a=a;//this.a belongs to instance variable 
    //     this.b=b;
    // }
     ThisKeyword(int a,int b)//constructor
    {
        this.a=a;//this.a belongs to instance variable 
        this.b=b;
    }

    void printValues(){
        System.out.println(a);
        System.out.println(b);

    }
    public static void main(String[] args) {
        ThisKeyword key=new ThisKeyword(100,200);
       // key.getValues(10, 20);
        key.printValues();

    }
    
}

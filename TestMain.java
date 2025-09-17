package Interface;

interface A {
   int a=10;//By default variable i interface are static and final
   
   void m1(); //abstract method by default public
}

public class TestMain implements A{
     
   //Method in interface are public by default
   public void m1(){
      System.out.println(a);
   }
   public static void main(String[] args) {
      TestMain test=new TestMain();//
    //  A ab=new TestMain();A ab is variable with class (variable is create by interface) and testMain is ininstantiate
      test.m1();
      
   }
    
}

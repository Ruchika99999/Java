package Basics;
class Animal{
    
    String colour="White";

    void eating(){
        System.out.println("Eating....................");
    }
    Animal(){
        System.out.println("I am from Animal Class");
    }
 }

 class Dog extends Animal{
    
    String colour="Black";

    // void displayColour(){
    //    System.out.println(colour); 
    //    //Super can be used to refer immediate parent class instance variable
    //    System.out.println(super.colour);

    // }
    void eating(){
        System.out.println("Eating Bread....................");
        //Super can be used to invoke immediate parent class method
        super.eating();
    }
    Dog(){
        super();//Invoke parent class constructor
        System.out.println("I am from Dog Class");
    }
 }








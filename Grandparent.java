package Inheritance;

class Grandparent {
    void display1() {
        System.out.println("Grandparent class");
    }
}

class Parent extends Grandparent {
    void display2() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void display3() {
        System.out.println("Child class");
    }
}


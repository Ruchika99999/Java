package Assignments;

public class Assignment5 {
    public static void main(String[] args) {
        String a="WELCOME";
        String b="welcome";
        System.out.println("Both are equal "+a.equalsIgnoreCase(b));
        System.out.println("Merging both the string : "+a.concat(" "+b));
        System.out.println("Lenght of  the String : "+ a.length());
        System.out.println("Changing into upper Case "+b.toUpperCase());
        System.out.println("Changing into Lower Case "+a.toLowerCase());
    }
    
}

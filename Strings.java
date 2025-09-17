package Basics;

public class Strings{
    public static void main(String[] args) {
        String s="Welcome to India Bro ";
        String s1="Welcome to Home Bro";
        String s2="WELCOME TO INDIA BRO";
        
        System.out.println("Lenght of the string : "+ s.length());
        System.out.println("UpperCase of the string : "+ s.toUpperCase());
        System.out.println("LowerCase of the string : "+ s.toLowerCase());
        System.out.println("Character at 3 index : "+ s.charAt(4));//Staring from 0
        System.out.println("Concatenation of the string : "+ s+s1);
        System.out.println("Trim the string : "+ s.trim());//EndSpaceand strating Spaces is deleted
        System.out.println("Contain Wel in the string : "+ s.contains("Wel"));
        System.out.println("Check whether s is equal to s1 : "+ s.equals(s1));
        System.out.println("Check whether s1 is equal to s2 in lower case "+ s1.equalsIgnoreCase(s2));
        System.out.println("Check whether s1 is equal to s2  : "+ s1.equals(s2));//Only case diiferent
        System.out.println("Replace Welcome By Getlost  : "+s.replace("Welcome","GetLost"));
        System.out.println(" Substring  : "+s.substring(2) );//Staring from 0
        System.out.println(" Substring  : "+s.substring(4, 9));//Ending starts from 1
        
    
    
    
    }

    
    
}

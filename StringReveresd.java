package HackerRank;

import java.util.Scanner;

public class StringReveresd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
         String reversed = new StringBuilder(A).reverse().toString();
         System.out.println(reversed);
       
    }
    
}

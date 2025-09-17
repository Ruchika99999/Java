package HackerRank;

import java.util.Scanner;

public class Solution {
    
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int line=1;
      
        while (sc.hasNext()) {
            String b= sc.nextLine();
            System.out.println(line + " " +b);
              line++ ;
        }
        
        sc.close();
    }
}

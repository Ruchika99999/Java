package HackerRank;

import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
       String[] tokens = s.split("[ !,?._'@]+");
       System.out.println(tokens.length);

       System.out.println(tokens.length);
       
       // Print each token on a new line
       for(int i=0;i<tokens.length;i++){
       System.out.println(tokens[i]);
 }
    }
}

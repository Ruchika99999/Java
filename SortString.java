package Assignments;
import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        char s[]={'Z','A','G'};
        System.out.println("Before Sorting"+Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("After Sorting"+Arrays.toString(s));

        String s1[]={"Ruchika","Annu","Pragya","Bolo"};
        System.out.println("Before Sorting: "+Arrays.toString(s1));
        Arrays.sort(s1);
        System.out.println("After Sorting: "+Arrays.toString(s1));
        
        
    }

}
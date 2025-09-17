package Assignments;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int b[]={100,700,500,200,300,400};
        System.out.println("Before Sorting.........");
        System.out.println("Array"+Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("After Sorting.........");
        System.out.println(Arrays.toString(b));
    }

}

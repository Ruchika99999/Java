package Assignments;
import java.util.Arrays;

public class ElementReverse {
public static void main(String[] args) {
    int a[]={800,900,200,500,400};
    Arrays.toString(a);
    for(int i=a.length-1;i>=0;i--){
        System.out.println(a[i]);
    }
    Arrays.sort(a);
    System.out.println(Arrays.toString(a));
}
       
    
}

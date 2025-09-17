package Assignments;

public class Assignment3 {
    public static void main(String[] args) {
        int a[] =new int[5];
         a[0]=1000;
         a[1]=2000;
         a[2]=3000;
         a[3]=4000;
         a[4]=5000;
         int sum=0;
         
         for(int i=0;i<5;i++){

            sum=sum+a[i];
           
         }
         System.out.println("Sum is :"+sum);

    }
    
}

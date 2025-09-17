package Assignments;
public class RepeationSearch {
    public static void main(String[] args) {
        int a[]= new int[10];
        a[0]=100;
        a[1]=200;
        a[2]=100;
        a[3]=400;
        a[4]=500;
        a[5]=600;
        a[6]=700;
        a[7]=100;
        a[8]=900;
        a[9]=1000;
        int num=100;
        int count=0;

        for(int value:a){
            if(value==num){
                count++;
                
            }
            
        }
        System.out.println(count);
    }
}

package Assignments;
public class LinearSearch {
    public static void main(String[] args) {
        int a[]= new int[10];
        a[0]=100;
        a[1]=200;
        a[2]=00;
        a[3]=400;
        a[4]=500;
        a[5]=600;
        a[6]=700;
        a[7]=800;
        a[8]=900;
        a[9]=1000;

        for(int i: a){
            if(i==300){
                System.out.println("Number found");
             }
            
        }
        String b[]= new String[5];
        b[0]="Cat";
        b[1]="Dog";
        b[2]="Elephant";
        b[3]="Mouse";
        b[4]="Rat";

        for(String j: b){
            if(j=="Dog"){
                System.out.println("Number found");
             }
            
        }
        
}
}

package Basics;

public class SingleDimensionaArray {
    public static void main(String[] args) {
        int a[] =new int[5];//declared array with size 5 ,starting index is 0,last index is 4
        //storing / (inserting) values into array
         a[0]=1000;
         a[1]=2000;
         a[2]=3000;
         a[3]=4000;
         a[4]=5000;

         System.out.println(a[3]);//Read specific value
         //************************************
        int b[]={100,200,300,400} ;//Declared an array without specifying size
        System.out.println(a.length);//Print the lenght/size od an array
        // for(int i=0;i<=a[4];i++){//for(int i=0;i<=a.lenght/a.lenght-1;i++)
        //     System.out.println(a[i]);
        // }

        for(int i:a){//a is array and i store each one element of a one by one
            System.out.println(i);
        }
    }
}

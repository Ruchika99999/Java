package Arrays;

public class MultiD {
    public static void main(String[] args) {
        int a[][]=new int[3][2];
        //dont know size then we use int a[][]={{1,2},{2,7}};
        a[0][0]=100;
        a[0][1]=200;

        a[1][0]=300;
        a[1][1]=400;

        a[2][0]=500;
        a[2][1]=600;
      
        for(int i=0;i<3;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println("First "+a[i][j]);
            }
        }
   for( int r[]:a){
    for (int c:r){
        System.out.println("Second "+c);
    }
   }
 }

    
}

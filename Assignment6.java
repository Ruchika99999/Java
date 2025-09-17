package Assignments;

public class Assignment6 {


    int sum(int x,int y){

        int twoDigit=x+y;
        System.out.println("Sum of x and y :"+twoDigit);//20
        return twoDigit;
    }
    int sum(int x,int y,int z){
        
        int threeDigit=x+y+z;
        System.out.println("Sum of x ,y and z "+threeDigit);//30
        return threeDigit;
    }

    double sum(double x,double y){
        double twoDigit1=x+y;
        System.out.println("Sum of x and y "+twoDigit1);//20
        return twoDigit1;
    }
    double sum(double x,double y,double z){
       double threeDigit1=x+y+z;
        System.out.println("Sum of x ,y and z "+threeDigit1);//30
        return threeDigit1;
    }

    

    public static void main(String[] args) {
        Assignment6 cal=new Assignment6() ;
        cal.sum(10, 10) ;
        cal.sum(10, 10, 10);
        cal.sum(10, 10);
        cal.sum(10, 10, 10);
        
    }
    
}

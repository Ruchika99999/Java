package Basics;

public class Operators {
    public static void main(String[] args) {
        //Arthimatic operators
        System.out.println("--------- Arthimatic operators------------");
        int a=100;
        int b=10;
        int sum ,sub,mul,div,mod;
        sum=a+b;//110
        sub=a-b;//90
        mul=a*b;//1000
        div=a/b;//10
        //Remainder
        mod=a%b;//0
        System.out.println("Summation of a+b is : "+sum);
        System.out.println("Subtraction of a-b is : "+sub);
        System.out.println("Multiplication of a*b is : "+mul);
        System.out.println("Divide of a and b is : "+div);
        System.out.println("Remainder of a and b is : "+mod);

        //Relational Operators
        //Always Return boolean value

        System.out.println("---------Relational Operators------------");
        System.out.println(a==b);//false
        System.out.println(a>b);//true
        System.out.println(a<b);//false
        System.out.println(a>=b);//true
        System.out.println(a<=b);//false
        System.out.println(a!=b);//true

        //Logical Operators && ||
        //Works btw 2 boolean
        boolean x=true;
        boolean y=false;
        System.out.println("---------Logical Operators------------");
        System.out.println( x && y);// false
        System.out.println( x || y);//true
        System.out.println( !x);//false
        System.out.println( !y);//true

        //increment oprators ++ --
        int n=10;
        n=n++;  //a=a+1
        System.out.println(n);//11

        int m=20;
        m=m--;
        System.out.println(m);//19

        System.out.println("--------Ternary Operators------------");
        int time=100;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);


        


    



    }

    
}

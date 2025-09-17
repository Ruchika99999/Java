package Final;


class Bike{
   final void run(){
     System.out.println("Running         ...........");
   }
}

class Honda extends Bike{
//     void run(){     ------------->Compile error because change the value of the method in override in the child clas
//         System.out.println("Started...........");
     
//     }
 }

public class FinalMethod {
    public static void main(String[] args) {
       Honda fa=new Honda();
       fa.run();
       
    
    }
    
}

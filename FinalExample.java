package Final;



class FinalExample {

   final int speed=40;//we cannot change the value
    //int speed=40;

    public static void main(String[] args) {
       FinalExample fav=new FinalExample();
       //fav.speed=100; gives complier error
       System.out.println(fav.speed); 
    }

    
}

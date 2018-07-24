public class Main {

    // If you dont have instruction if you'll have endless loop
    static void countdown(int counter){
       if(counter<=0) {
           return;
       }else{
           System.out.println(counter);
           countdown(counter - 1);
       }
    }

    // Simple function figure out factorial
    static int factorial(int x){
        if(x==1){
            return 1;
        }
        return x*factorial(x-1);
    }

    public static void main(String [] args){

        System.out.println("Countdown Test: ");
        countdown(10);

        System.out.println("Factorial Test: ");
        System.out.println("Fact(10)= "+factorial(10));
    }
}

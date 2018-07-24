import java.util.*;

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

    static int sumTableLoop(Integer [] tab){
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum+=tab[i];
        }
        return sum;
    }
    static int sumTable(Integer [] tab){
        if(tab.length==0){
            return 0;
        }else if( tab.length==1){
            return tab[0];
        }else{
            return tab[0] +(sumTable(Arrays.copyOfRange(tab,1,tab.length)));
        }
    }
    static int sumList(List<Integer> list){
        if(list.size()==0){
            return 0;
        }else if(list.size()==1){
            return list.get(0);
        }
        return list.get(0) + sumList(list.subList(1,list.size()));
    }

    static int sumListLoop(List<Integer> list){
        int sum=0;
        for (int x:list) {
            sum+=x;
        }
        return sum;
    }

    public static void main(String [] args){

        Integer table[] = new Integer[]{1,2,3};
        List<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(12);
        list.add(13);

        System.out.println("Test sumTable: "+sumTable(table));
        System.out.println("Test sumList: "+sumList(list));
        System.out.println("Test sumTableLoop: "+sumTableLoop(table));
        System.out.println("Test sumListLoop: "+sumListLoop(list));


        System.out.println("Countdown Test: ");
        countdown(10);

        System.out.println("Factorial Test: ");
        System.out.println("Fact(10)= "+factorial(10));
    }
}

import java.util.*;

public class Main {

    // If you dont have instruction if you'll have endless loop
    static void countDown(int counter){
       if(counter<=0) {
           return;
       }else{
           System.out.println(counter);
           countDown(counter - 1);
       }
    }
    static void countDownLoop(int counter){
        while(counter > 0){
            System.out.println(counter);
            counter--;
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

    static int findMaxRecursively(List<Integer> numbers)
    {
        if(numbers.size() == 1)
            return numbers.get(0);

        int sub_max= findMaxRecursively(numbers.subList(1,numbers.size()));
        if(numbers.get(0)>sub_max){

        }else {
            return sub_max;
        }
        return numbers.get(0);
    }

    static int finMaxRecursivelyLoop(List<Integer> numbers){
        int max= numbers.get(0);

        for (int x:numbers) {
            if(x>=max){
                max=x;
            }
        }
        return max;
    }

    static int findMinRecursively(List<Integer> numbers)
    {
        if(numbers.size() == 1)
            return numbers.get(0);

        int sub_min= findMaxRecursively(numbers.subList(1,numbers.size()));
        if(numbers.get(0)<sub_min){

        }else {
            return sub_min;
        }
        return numbers.get(0);
    }

    static int finMinRecursivelyLoop(List<Integer> numbers){
        int min= numbers.get(0);

        for (int x:numbers) {
            if(x<=min){
                min=x;
            }
        }
        return min;
    }

    static int sumListLoop(List<Integer> list){
        int sum=0;
        for (int x:list) {
            sum+=x;
        }
        return sum;
    }

    static int fibonacci(int figure){
        if(figure==0){
            return 0;
        }else if(figure==1){
            return 1;
        }else{
           return fibonacci(figure-1)+fibonacci(figure-2);
        }
    }

    public static void main(String [] args){

        Integer table[] = new Integer[]{3,5,1};
        List<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(99);
        list.add(13);
        list.add(14);

        System.out.println("Test sumTable: "+sumTable(table));
        System.out.println("Test sumList: "+sumList(list));
        System.out.println("Test sumTableLoop: "+sumTableLoop(table));
        System.out.println("Test sumListLoop: "+sumListLoop(list));
        System.out.println("Test maxList: "+findMaxRecursively(list));
        System.out.println("Test minList: "+findMinRecursively(list));
        System.out.println("Test maxListLoop: "+ finMaxRecursivelyLoop(list));
        System.out.println("Test minListLoop: "+ finMinRecursivelyLoop(list));


        System.out.println("Countdown Test: ");
        countDown(10);

        System.out.println("Countdown Test Loop: ");
        countDownLoop(10);

        System.out.println("Factorial Test: ");
        System.out.println("Fact(10)= "+factorial(10));

        System.out.println("Fibo Test: ");
        System.out.println("Fibo: "+fibonacci(10));
    }
}

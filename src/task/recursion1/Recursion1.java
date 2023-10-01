package task.recursion1;

public class Recursion1 {

    public static void numbersUp(int a, int b){
        if(a<=b){
            System.out.println(a);
            numbersUp(a+1, b);
        }
    }

    public static void numbersDown(int a, int b){
        if(a>=b){
            System.out.println(a);
            numbersDown(a-1, b);
        }
    }
}

package task.recursion1;

import java.util.Scanner;

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

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a<b){
            numbersUp(a, b);
        }
        else{
            numbersDown(a, b);
        }
    }
}

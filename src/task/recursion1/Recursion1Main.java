package task.recursion1;

import java.util.Scanner;

import static task.recursion1.Recursion1.numbersDown;
import static task.recursion1.Recursion1.numbersUp;

public class Recursion1Main {
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

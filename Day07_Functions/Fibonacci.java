//Qs-> Write a program to print Fibonacci series of n terms where n is input by user :
//0 1 1 2 3 5 8 13 21 ..... 
//In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

import java.util.*;
public class Fibonacci {
    public static void printFibonacci(int n){
        int a=0;
        int b=1;

        System.out.print(a+" ");
        System.out.print(b+" ");

        for(int i=3; i<=n; i++){
            int next=a+b;
            System.out.print(next+" ");
            a=b;
            b=next;
        }

    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        printFibonacci(n);

        sc.close();
    }
    
}

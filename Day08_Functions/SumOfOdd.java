//Qs-> Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;
public class SumOfOdd {
    public static void printSumofOdd(int n){
        int sum=0;
        for(int i=1; i<= n; i=i+2){
            sum=sum+i;

        }
        System.out.println("Sum of odd numbers is: "+sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        printSumofOdd(n);
        sc.close();
    }
}

//Qs-> Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)

import java.util.*;
public class GreatestCommonDivisor {
    public static int findGCD(int a,int b){
        int gcd=1;
        for(int i=1; i<=Math.min(a,b); i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();

        System.out.println("GCD is: "+findGCD(a, b));
        
        sc.close();
    }
}

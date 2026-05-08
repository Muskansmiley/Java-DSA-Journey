// Qs-> Make a function to check if a number is prime or not.

import java.util.*;
public class PrimeNumber {

    public static void checkPrime(int n){

        if(n<=1){
            System.out.println("Not Prime");
            return;
        }

        boolean isPrime=true;

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        
        checkPrime(n);

        sc.close();
    }
}

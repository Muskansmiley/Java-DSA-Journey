// Qs-> Make a function to check if a given number n is even or not.

import java.util.Scanner;

public class Even {

    public static void checkEven(int n){
        if(n%2==0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is odd");
        }
        
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n:");
    int n=sc.nextInt();
    
    checkEven(n);


    sc.close();
    }
}

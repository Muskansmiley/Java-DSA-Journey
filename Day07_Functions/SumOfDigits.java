import java.util.Scanner;

public class SumOfDigits{
    public static int Sumdigits(int n){
        int sumDig=0;
        while(n>0){
            int lastDigit=n%10;
            sumDig=sumDig+lastDigit;
            n=n/10;
        }
        return sumDig;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        System.out.println("Sum of digits: "+Sumdigits(n));

        sc.close();
    }
}
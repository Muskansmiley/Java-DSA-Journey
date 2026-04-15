//Arithmetic operators (+ - * / %)
//Assignment (= += -=)
//Comparison (== != > < >= <=)
//Logical (&& || !)
import java.util.*;
public class Operators{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1=sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2=sc.nextInt();

        int sum=num1+num2;
        int diff=num1-num2;
        int product=num1*num2;
        int division=num1/num2;
        int remainder=num1%num2;

        System.out.println("Sum is: "+sum);
        System.out.println("Diff is: "+diff);
        System.out.println("Product is: "+product);
        System.out.println("Division  is: "+division);
        System.out.println("Remainder is: "+remainder);

        sc.close();
    }
}
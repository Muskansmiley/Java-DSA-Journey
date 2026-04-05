//Problem 1:
//Take 2 numbers input → print sum

import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("SumOfTwoNumbers: "+sum);
        sc.close();
    }
}

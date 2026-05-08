//Qs-> Enter 3 numbers from the user & make a function to print their average.

import java.util.*;
public class Average {
    public static void printAverage(int a, int b, int c){
        double average=(a+b+c)/3.0;
        System.out.println(average);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        System.out.print("Enter c: ");
        int c=sc.nextInt();

        printAverage(a, b, c);

        sc.close();

    }
}

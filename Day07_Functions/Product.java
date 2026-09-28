// Write the function to Calculate the product of 2 numbers. 

import java.util.Scanner;

public class Product {
    public static int calculateProduct(int a, int b){
        int product=a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();

        int product=calculateProduct(a, b);
        System.out.println("Product of a&b is: "+product);

        sc.close();
    }
}

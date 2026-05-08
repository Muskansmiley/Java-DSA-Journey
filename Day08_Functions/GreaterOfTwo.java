//Qs-> Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;
public class GreaterOfTwo {

    public static int checkGreater(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int  a= sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();

        System.out.println(checkGreater(a, b));

        sc.close();
    }
}

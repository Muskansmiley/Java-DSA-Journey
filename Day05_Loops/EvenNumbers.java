//Qs-> Print all even numbers till n.

import java.util.*;
public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        for(int i=2; i<=n; i=i+2){
            System.out.println(i);
        }
        sc.close();
    }
}

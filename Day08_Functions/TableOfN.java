//Qs-> Make a function to print the table of a given number n.

import java.util.*;
public class TableOfN {

    public static void printTable(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n+"X"+i+"="+(n*i));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        printTable(n);

        sc.close();
    }
}

//Qs-> find nth number Fibonacci number.
// 0 1 1 2 3 5 8 13 . . . 

import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a=0;
        int b=1;

        if(n==0){
            System.out.println("0");
            
        }
        else if(n==1){
            System.out.println("1");
            
        }else{
            for(int i=2;i<=n;i++){
            int next=a+b;
            a=b;
            b=next;
            }
            System.out.println(b);
        }
        sc.close();
    }
}

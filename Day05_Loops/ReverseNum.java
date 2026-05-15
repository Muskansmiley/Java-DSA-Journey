//Qs-> Reverse the given number
//suppose n=12345 o/p = 54321

import java.util.*;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n: ");
        int n=sc.nextInt();

        int ans=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            ans=ans*10+rem;
        }
        System.out.println(ans);

        sc.close();
    }
}

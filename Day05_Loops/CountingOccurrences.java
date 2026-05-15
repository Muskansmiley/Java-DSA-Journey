//Qs-> Count how many times one specific number comes in the given number.
// suppose n=1385757879, calculate number of times 7 repeats, ans=3.

import java.util.*;
public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num: ");
        int num=sc.nextInt();
        System.out.println("Enter n: ");
        int n=sc.nextInt();

        int count =0;
        while(num>0){
            int rem=num%10;
            if(rem==n){
                count++;
            }
            num=num/10;


        }
        System.out.println(count);
        sc.close();
    
}
}

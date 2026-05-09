// Qs-> Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

import java.util.*;
public class XPowerN {
    public static int calculatePower(int x, int n){
        int result=1;

        for(int i=1; i<=n; i++){
            result=result*x;
        }
        return result;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x: ");
        int x=sc.nextInt();
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        int answer=calculatePower(x, n);

        System.out.println("X raised to power n is: "+answer);

        sc.close();
    }
}

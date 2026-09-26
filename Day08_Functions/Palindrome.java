import java.util.Scanner;

public class Palindrome{
    public static boolean isPalindrome(int n){
        int palindrome=n;
        int reverse=0;
        while(n>0){
            int remainder=n%10;
            reverse=reverse*10+remainder;
            n=n/10;
        }
        if(palindrome==reverse){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();

        if(isPalindrome(n)){
            System.out.print(n+" "+"is Palindrome");
        }else{
            System.out.print(n+" "+"is not Palindrome");
        }
        
        sc.close();

    }
}
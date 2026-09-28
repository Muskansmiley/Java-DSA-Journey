import java.util.Scanner;

public class CheckEvenOrNot{
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        if(isEven(n)){
            System.out.print(n+ "is Even");
        }
        else{
            System.out.print(n+ "is Odd");
        }
        sc.close();
    }
}
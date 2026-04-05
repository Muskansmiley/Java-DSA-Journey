//Problem: Take a name as input and output Hello Name 
import java.util.Scanner;
public class HelloName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=sc.next();
        System.out.println("Hello "+name);
        sc.close();
    }

    
}

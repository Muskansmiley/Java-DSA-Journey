//Problem: Take age input → print after 5 years age
import java.util.Scanner;
public class AgeFiveYearsAhead {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age=sc.nextInt();
        int newage=age+5;
        System.out.println("AgeFiveYearsAhead: "+newage);
        sc.close();

    }
}

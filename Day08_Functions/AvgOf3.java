import java.util.Scanner;

public class AvgOf3{
    public static double AverageOf3(double x, double y, double z){
        return (x+y+z)/3;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter x: ");
        double x=sc.nextDouble();
        System.out.print("Enter y: ");
        double y=sc.nextDouble();
        System.out.print("Enter z: ");
        double z=sc.nextDouble();

        System.out.println("the avg is:"+AverageOf3(x, y, z));

        sc.close();
    }
}
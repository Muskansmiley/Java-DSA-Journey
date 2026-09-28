//Qs-> Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;
public class CircumferenceOfCircle{
    public static Double getCircumference(double radius){
        return 2*Math.PI*radius;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius: ");
        Double radius=sc.nextDouble();

        System.out.println(getCircumference(radius));

        sc.close();
    }
}
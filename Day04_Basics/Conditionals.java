// Conditional Statements- if, else, else if, switch, break
import java.util.*;
public class Conditionals {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age: ");
        int age=sc.nextInt();

        if(age>18){
            System.out.println("Adult");
        }else{
            System.out.println("Not Adult");
        }

    }
}

// to print: with package
// cd ..
// javac Day04_Basics/Conditionals.java
// java Day04_Basics.Conditionals

// to delete package
// remove package line 
// cd Day04_Basics
// del *.class
// javac Conditionals.java
// java Conditionals

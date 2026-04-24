// Q -> print greeting
// Button 1 -> Hello
// Button 2 -> Namaste
// Button 3 -> Bonjour

import java.util.*;
public class Button {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Button Number: ");
        int button=sc.nextInt();

        // if(button==1){
        //     System.out.println("Hello");
        // } else if(button==2){
        //     System.out.println("Namaste");
        // } else if(button==3){
        //     System.out.println("Bonjour");
        // }else{
        //     System.out.println("Invalid button");
        // }

        //using switch

        switch(button){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid Button");
        }
        sc.close();
    }
}

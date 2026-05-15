//Qs-> check if the given letter is Lowercase or Uppercase.

import java.util.*;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch= sc.next().trim().charAt(0);

        if(ch>='a' && ch<='z'){
            System.out.println("Lowecase");
        }else{
            System.out.println("Uppercase");
        }
        sc.close();
    }
}

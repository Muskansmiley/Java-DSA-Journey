// We will be learning about functions in strings.
import java.util.*;
public class Functions {
    public static void main(String[] args) {

        //Concatenation
        String firstName="Muskan";
        String lastName="Gupta";
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);

        //charAt
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }

        //compare
        String name1="Disha";
        String name2="Disha";

        //1 s1>s2
        //2 s1==s2
        //3 s1<s2

        if(name1.compareTo(name2)){

        }

    }
    
}

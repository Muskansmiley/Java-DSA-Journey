import java.util.*;
public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        System.out.print("Enter c: ");
        int c=sc.nextInt();

        // if(a==b && b==c){
        //     System.out.println("All are equal");
        // }else if(a==b && a>c){
        //     System.out.println("Max of Three is a and b");
        // }else if(b==c && b>a){
        //     System.out.println("Max of Three is b and c");
        // }else if(a==c && a>b){
        //     System.out.println("Max of Three is a and c ");
        // }else if(a>b && a>c){
        //     System.out.println("Max of Three is a");
        // }else if(b>c && b>a){
        //     System.out.println("Max of Three is b");
        // }else{
        //     System.out.println("Max of Three is c");
        // }

        int max=Math.max(a,Math.max(b,c));
        System.out.println("Max is: "+max);
        
        sc.close();
    }
}

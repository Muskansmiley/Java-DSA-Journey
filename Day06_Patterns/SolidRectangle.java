// Print the Pattern
// * * * * *
// * * * * *
// * * * * *
// * * * * *

//basically printing different col and rows


import java.util.*;
public class SolidRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter thr number of rows: ");
        int r=sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c=sc.nextInt();

        for(int i=1;i<=r;i++){
            for(int j=1; j<=c;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

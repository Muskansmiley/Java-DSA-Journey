//Qs-> Print the pattern:
//       *
//     * *
//   * * *
// * * * *

// basically rotated by 180 degree

import java.util.*;
public class RotatedHalfPyramid{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter thr number of rows: ");
        int n=sc.nextInt();

        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop -> space print
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //inner loop -> star print
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        sc.close();
    }
}

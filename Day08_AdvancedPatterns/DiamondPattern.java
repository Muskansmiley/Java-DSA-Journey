//Qs->Print the Pattern:
//       *
//     * * *
//   * * * * *
// * * * * * * *
// * * * * * * *
//   * * * * *
//     * * *
//       *

public class DiamondPattern {
    public static void main(String[] args) {
        int n=4;

        //outer loop
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            int stars=2*i-1;
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();

           

        }
        //lower half
        for(int i=n; i>=1; i--){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            int stars=2*i-1;
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();

           

        }
    } 
}

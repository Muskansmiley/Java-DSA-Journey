//Qs-> Print the Pattern
//         * * * * *    
//       *       *
//     *       *
//   *       *
// * * * * *

public class P08_HollowRhombus {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // stars at boundary if i==1 or i==n or j==1 or j==n 
            // else spaces
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}

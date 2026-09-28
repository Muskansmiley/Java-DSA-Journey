//Qs-> Print the Pattern
//         1
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4     
// 5 4 3 2 1 2 3 4 5

public class PalindromicPattern {
    public static void main(String[] args) {
        int n=5;

        //outer loop
        for(int i=1;i<=n; i++){
            //spaces
            int spaces=n-i;
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            //numbers-palindrome-first half
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            //2nd half
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

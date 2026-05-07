//Qs-> Print The Pattern:
//     1
//    2 2 
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

public class NumberPyramid {
    public static void main(String[] args) {
        int n=5;

        //outer loop
        for(int i=1; i<=n; i++){
            //spaces
            int spaces=n-i;
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            //numbers-> print row no, row no times
            for(int j=1;j<=i;j++){
                System.out.print(i+ " ");
            }
            System.out.println();

        }
    }
}

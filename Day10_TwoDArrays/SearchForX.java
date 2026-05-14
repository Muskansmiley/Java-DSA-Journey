//Qs-> Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.

import java.util.*;
public class SearchForX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter the number of cols: ");
        int cols=sc.nextInt();

        int [][]matrix=new int[rows][cols];

        //input
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                
                matrix[i][j]=sc.nextInt();
            }
        }

        //taking x from user
        System.out.println("Enter x: ");
        int x=sc.nextInt();

        //output
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                //compare with x
                if(matrix[i][j]==x){
                    System.out.println("X found at location ("+i+","+j+")");
                }
            }
        }
        sc.close();


    }
}

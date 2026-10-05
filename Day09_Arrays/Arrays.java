import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size=sc.nextInt();
        
        //first way 

        // int[] marks=new int[3];
        // marks[0]=97; // phy
        // marks[1]=98; // chem
        // marks[2]=95; // eng

        // second way
        // int marks[]= {97, 98, 95};

        int numbers[]=new int[size];

        //input
        for(int i=0; i<size;i++){
            System.out.print("Enter the numbers at "+i+": ");
            numbers[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.print(numbers[i]+" ");
        }
        sc.close();

    }
}

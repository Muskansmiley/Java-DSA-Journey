import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

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
            numbers[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }
        sc.close();

    }
}

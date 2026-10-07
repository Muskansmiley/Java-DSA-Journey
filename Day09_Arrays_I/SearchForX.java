//Qs-> Take an Array as input from the user. Search for a given number x and print the index at which it occurs.

import java.util.*;
public class SearchForX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int size=sc.nextInt();
        int numbers[]=new int[size];

        for(int i=0; i<size;i++){
            numbers[i]=sc.nextInt();
        }

        int x=sc.nextInt();

        //numbers.length=size

        for(int i=0;i<size;i++){
            if(numbers[i]==x){
                System.out.println("X found at index: "+i);
            }

        }
        sc.close();
    }
}

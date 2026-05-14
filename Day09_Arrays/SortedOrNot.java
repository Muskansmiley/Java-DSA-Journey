//Take an array of numbers as input and check if it is an array sorted in ascending order.
//Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//     {3, 4, 6, 2} is not sorted in ascending order.

import java.util.*;
public class SortedOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int numbers[]=new int[size];

        //input
        for(int i=0; i<size; i++){
            numbers[i]=sc.nextInt();
        }

        boolean isAscending=true;

        //Notice: numbers.length - 1 as termination condition
        for(int i=0; i<numbers.length-1;i++){
            //This is condition for descending order
            if(numbers[i]>numbers[i+1]){
                isAscending=false;
                break;
            }

        }
        if(isAscending){
            System.out.println("Array is sorted in ascending order");
        }else{
            System.out.println("Array is not sorted in ascending order");
        }
        sc.close();


    }
}

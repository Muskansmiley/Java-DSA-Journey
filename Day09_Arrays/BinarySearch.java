//It should always have numbers in ascending or descending order.
// This particular code works for Ascending order.
public class BinarySearch {
    public static int bs(int[]numbers,int key){
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
            return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int[]numbers={2,4,6,8,10,12,14,16};
        int key=11;
        System.out.println("key is found at index: "+bs(numbers, key));
    }
}

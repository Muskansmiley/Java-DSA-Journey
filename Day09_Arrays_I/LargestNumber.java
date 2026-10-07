public class LargestNumber {
    public static int getLargest(int[]numbers){
        int largest=Integer.MIN_VALUE;  //-infinity

        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;

    }
    public static void main(String[] args) {
        int[]numbers={2,4,6,8,5};
        System.out.println("Largest number is: "+getLargest(numbers));
    }
}

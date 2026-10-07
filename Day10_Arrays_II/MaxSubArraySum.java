//Brute force
// to calculate the sum of each subarray and find the max sum
// time complexity-O(n^3) which is actually very bad

public class MaxSubArraySum {
    public static void subArraySum(int[]numbers){
        int maxSum=Integer.MIN_VALUE;
        
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                int currSum=0;
                for(int k=i;k<=j;k++){
                    currSum+=numbers[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
            System.out.println();
        }
        System.out.print("maxSum="+maxSum);
        
    }
    public static void main(String[] args) {
        int[]numbers={2,4,6,8,10};
        subArraySum(numbers);
    }
}

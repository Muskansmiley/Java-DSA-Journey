// Q-> Calculate the sum of each subArray
// there are 2 ways
//way-1 with 2 loops i and j
public class SumOfSubArrays{
    public static void subArraySum(int[]numbers){
        for(int i=0;i<numbers.length;i++){
            int currSum=0;
            for(int j=i;j<numbers.length;j++){
                currSum=currSum+numbers[j];
                System.out.println(currSum);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[]numbers={2,4,6,8,10};
        subArraySum(numbers);
    }
}
//way-2 with 3 loops i , j and k
// public class SumOfSubArrays {
//     public static void subArraySum(int[]numbers){
        
//         for(int i=0;i<numbers.length;i++){
            
//             for(int j=i;j<numbers.length;j++){
//                 int currSum=0;
//                 for(int k=i;k<=j;k++){
//                     currSum=currSum+numbers[k];
                    
//                 }
//                 System.out.println(currSum);

//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int[]numbers={2,4,6,8,10};
//         subArraySum(numbers);
//     }
// }

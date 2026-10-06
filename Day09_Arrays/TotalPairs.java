public class TotalPairs {
    public static void printPairs(int[]numbers){
        int tp=0;
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs are: "+tp);
    }
    public static void main(String[]args){
        int[]numbers={4,2,9,7,10,5};
        printPairs(numbers);
    }

}

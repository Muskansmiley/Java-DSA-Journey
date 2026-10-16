public class KadanesAlgo {
    public static void kadanes(int[]nums){
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<nums.length;i++){
            cs=cs+nums[i];
            ms=Math.max(nums[i],ms);        // to handle all negative array 
            ms=Math.max(cs,ms);
            if(cs<0){
                cs=0;
            }
            System.out.println("i=" + i + ", cs=" + cs + ", ms=" + ms);
            
        }
        System.out.println("maximum subarray sum is: "+ms);
    }
    public static void main(String[] args) {
        //int[]nums={-2,-3,4,-1,-2,1,5,-3};
        int[]nums={-1,-2,-3};
        kadanes(nums);
    }
}


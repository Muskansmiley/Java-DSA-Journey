public class LinearSearch {
    public static int ls(int[]numbers,int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int[]numbers={2,4,6,8,10,12,14,16,18};
        int key=10;

        int index=ls(numbers,key);
        if(index==-1){
            System.out.print("Not Found");
        }
        else{
            System.out.print("found at index: "+index);
        }
    }

}

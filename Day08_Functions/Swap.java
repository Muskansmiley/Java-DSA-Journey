public class Swap {
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a); //it prints swapped value
        System.out.println("b="+b);
    }
    public static void main(String[] args) {
        int a=5;
        int b=10;
        swap(a,b);  // function call
        // System.out.println("a="+a); //it prints value as it is doesn't swap because function will not work in main
        // System.out.println("b="+b);

    }
}

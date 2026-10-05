import java.util.*;
public class Update{
    public static void updatemarks(int[]marks){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]=new int[3];
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<marks.length;i++){
            System.out.print("Enter your number: ");
            marks[i]=sc.nextInt();
        }
        
        updatemarks(marks);

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        sc.close();
        

    }
}
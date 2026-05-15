import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int ans=0;
        while(true){
            System.out.print("Enter the operator: ");
            //take the operation as input
            char op= sc.next().trim().charAt(0);

            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
                //input two numbers
                System.out.print("Enter two numbers: ");
                int num1=sc.nextInt();
                int num2=sc.nextInt();

                if(op=='+'){
                   ans=num1+num2; 
                }
                if(op=='-'){
                   ans=num1-num2; 
                }
                if(op=='*'){
                   ans=num1*num2; 
                }
                if(op=='/'){
                    if(num2!=0){
                        ans=num1/num2; 
                    }
                }
                if(op=='%'){
                   ans=num1%num2; 
                }
                
            }
            else if(op=='x'|| op=='X' ){
                    break;
            }
            else{
                    System.out.println("Invalid operator");
            }
            System.out.println("answer is: "+ans);

        }
        sc.close();
    }
}

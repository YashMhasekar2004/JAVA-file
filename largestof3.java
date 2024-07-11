import java.util.*;
public class largestof3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number: ");
        int num1=sc.nextInt();
        System.out.print("enter 2nd number: ");
        int num2=sc.nextInt();
        System.out.print("enter 3rd number: ");
        int num3=sc.nextInt();
        if(num1>num2){
            if(num1>num3){
                System.out.print("the largest is "+num1);
            }
            else{
                System.out.print("the largest is "+num3);
            }

        }
        else{
            if(num2>num1){
                if(num2>num3){
                    System.out.print("the largest is "+num2);
                }
                else{
                    System.out.print("the largest is "+num3);
                }
            }
        }
        

    }

    
}

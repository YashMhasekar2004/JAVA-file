import java.util.*;
public class sumfunction2 {
    public static void calsum(int a,int b){
        
        int sum= a+b;
        System.out.print("The sum is: "+sum);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a= sc.nextInt();
        System.out.print("Enter b: ");
        int b= sc.nextInt();
        calsum(a,b);
    }

    
}

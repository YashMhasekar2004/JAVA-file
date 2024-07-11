import java.util.*;
public class sumfunction1 {
    public static void calsum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a= sc.nextInt();
        System.out.print("Enter b: ");
        int b= sc.nextInt();
        int sum= a+b;
        System.out.print("The sum is: "+sum);
        return;
    }
    public static void main(String args[]){
        calsum();
    }

    
}

import java.util.*;
public class factorial {
    public static void fact(int n){
        int fac =1;
        for(int i=1;i<=n;i++){
            fac*=i;

        }
        System.out.print("the factorial is" +fac );

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        fact(n);

    }
    
}

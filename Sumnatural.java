import java.util.*;
public class Sumnatural {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the vale of n: ");
        int n = sc.nextInt();
        int sum=0,i;

        for( i=1;i<=n;i++){
            sum+=i;
           

        }
        System.out.print(sum);




    }
    
}

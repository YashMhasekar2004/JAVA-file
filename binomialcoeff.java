import java.util.*;
public class binomialcoeff {
    public static int fact(int n){ //This code is might be of avg space complexity
        int f=1;
        for(int i=1;i<=n;i++){
             f=f*i;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int fact_n=sc.nextInt();
        System.out.print("enter the value of r: ");
        int fact_r=sc.nextInt();
        int a=fact(fact_n);
        int b=fact(fact_r);
        int c=fact_n - fact_r;
        int fact_nmr=fact(c);
        int Binomial=a/(b*fact_nmr);
        System.out.print("The binomial coefficient is : " +Binomial);

    }
    
}

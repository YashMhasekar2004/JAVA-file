public class bino {
    public static int fact(int n){ 
        int f=1;
        for(int i=1;i<=n;i++){
             f*=i;
        }
        return f;
    }
    public static int bincoefficient(int n,int r){
        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_nmr=fact(n-r);
        int bincoeff=fact_n/(fact_r*fact_nmr);
        return bincoeff;


    }
    public static void main(String args[]){
        System.out.print("the binomial coeff is : " +bincoefficient(5,2));
    }
    
}

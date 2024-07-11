public class isprimefun {
    public static boolean isPrime(int n){
        boolean isPrime=true;
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){ //can also take i<=n-1
            if(n%i==0){
                isPrime=false; //we can write return false instead line 6 and 7
                break;
            }

        }
        return isPrime;
    }
    public static void main(String args[]){
        System.out.println(isPrime(9));

    }

    
}

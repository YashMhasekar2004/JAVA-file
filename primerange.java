public class primerange {
    public static boolean isPrime(int n){
        boolean isPrime=true;
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;


    }
    public static void primerange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");

            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        primerange(50);
    }
    
}

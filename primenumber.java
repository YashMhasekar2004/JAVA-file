import java.util.Scanner;

public class primenumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n= sc.nextInt();
        if(n==2){
            System.out.print(n+ " is a prime number");
            
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(n+ " is not a prime number");
                break;
                
            }
            else{
                System.out.print(n+ " is a prime number");

            }
            
        }
       
        
    }
    
}

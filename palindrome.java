import java.util.*;

public class palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int original = n;  
        int rev = 0;
        
        while(n != 0) {
            int lastdigit = n % 10;
            rev = rev * 10 + lastdigit;
            n = n / 10;
        }
        
        if(original == rev){
            System.out.print("The number " + original + " is a palindrome.");
        } else {
            System.out.print("The number " + original + " is not a palindrome.");
        }
        
        
    }
}

    


import java.util.*;
public class switchcalci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number: ");
        int num1=sc.nextInt();
        System.out.print("enter 2nd number: ");
        int num2=sc.nextInt();
        System.out.print("enter the operator: ");
        char operator=sc.next().charAt(0);

        switch(operator){
            case '+': System.out.print("the addition is"+ num1+num2);
                      break;
            case '-': System.out.print(num1-num2);
                      break;
            case '*': System.out.print("the multiplication is"+ num1*num2);
                      break;
            case '/': System.out.print("the division is"+ num1/num2);
                      break;
            case '%': System.out.print("the remainder is"+ num1%num2);
                      break;

        }

    }
    
}

package basic_problems;
import java.util.Scanner;

public class check_palindrome {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num : ");
        int num = sc.nextInt();
        int temp = num;

        if(num < 0){
            System.out.println("Not Palindrome beacuse palindrome of negative number is not possible");
            sc.close();
            return;
        }

        int rev = 0;

        while(num != 0){
            int rem = num % 10;

            rev = rev * 10 + rem;
            num = num / 10 ;
        }

        if(temp == rev){
            System.out.println("palindrome");
        }

        else{
            System.out.println("Not Palindrome");
        }
        
        sc.close();
    }
}

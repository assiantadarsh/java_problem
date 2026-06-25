package basic_problems;
import java.util.Scanner;

// Write a Java program to check whether a number is prime or not.

public class check_prime_num {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num : ");
        int num = sc.nextInt();
        boolean is_prime = true;

        if(num == 1){
            System.out.println("Not prime");
            sc.close();
            return;
        }

        for(int i = 2;i < num; i++){
            if(num % i == 0){
                is_prime = false;
                break;
            }
        }

        if(is_prime){
            System.out.println("It is prime number ");
        }
        else{
            System.out.println("Not Prime");
        }

        sc.close();
    }
}

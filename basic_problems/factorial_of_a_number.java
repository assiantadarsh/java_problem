package basic_problems;
import java.util.Scanner;

public class factorial_of_a_number {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num : ");
        int num = sc.nextInt();

        if(num < 0){
            System.out.println("Not possible");
            sc.close();
            return;
        }

        int fact = 1;

        for(int i = 2;i <= num; i++){
            fact = fact * i;
        }

        System.out.println("Factorial = "+fact);

        sc.close();
    }
}

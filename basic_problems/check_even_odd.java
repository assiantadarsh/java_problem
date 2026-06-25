package basic_problems;
import java.util.Scanner;

public class check_even_odd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter Number : ");

        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Even");
        }

        else{
            System.out.println("Odd");
        }

        sc.close();
    }
}

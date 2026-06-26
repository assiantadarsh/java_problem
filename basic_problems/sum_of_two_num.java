package basic_problems;
import java.util.Scanner;

// Question: Write a Java program to take two numbers as input and print their sum.

public class sum_of_two_num{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");

        int a = sc.nextInt();

        System.out.println("Enter second number : ");

        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum = "+sum);

        sc.close();
    }
}
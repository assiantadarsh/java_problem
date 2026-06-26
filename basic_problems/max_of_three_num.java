package basic_problems;
import java.util.Scanner;

// Question: Write a Java program to find the greatest number among three numbers

public class max_of_three_num {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int a = sc.nextInt();

        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        System.out.println("Enter third number : ");
        int c = sc.nextInt();

        int max = a;
        
        if(max < b){
            max = b;
        }
        if(max < c){
            max = c;
        }

        System.out.println("The third maximum value is "+max);
        sc.close();

    }
}

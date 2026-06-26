package basic_problems;
import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 1;

        System.out.println("Enter n : ");
        int n = sc.nextInt();

        System.out.print(+a+" "+b+" ");

        for(int i = 1;i <= n - 2;i++){
            int c = a + b;
            a = b; 
            b = c;

            System.out.print(+b+" ");
        }
        sc.close();
    }

}

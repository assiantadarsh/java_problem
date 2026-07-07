package arrayproblem;
import java.util.Scanner;

public class Inp_out {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the positive value of n : ");
        int n = sc.nextInt();

        int[] numbers = new int[5];

        for(int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            System.out.print(numbers[i]+" ");
        }

        sc.close();
    }
}

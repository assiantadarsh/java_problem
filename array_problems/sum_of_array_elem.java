package arrayproblem;
import java.util.Scanner;

public class sum_of_array_elem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int sum = 0;

        for(int i = 0; i < n; i++){

            arr[i] = sc.nextInt();
        }
        
        for (int i = 0;i < n; i++){
            sum += arr[i];
        }

        System.out.println("Sum : "+sum);

        sc.close();
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];

        System.out.println("Enter array elements:");

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        int totalSum = n * (n + 1) / 2;

        int missing = totalSum - sum;

        System.out.println("Missing Number = " + missing);
    }
}

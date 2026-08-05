package arrayproblem;

import java.util.Scanner;

// Left rotate array by one place ?

public class left_rotate_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int temp = arr[0];

        for(int i = 1; i < n; i++){
            arr[i - 1] = arr[i];
        }

        arr[n - 1] = temp;

        for(int i = 0; i <n; i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}

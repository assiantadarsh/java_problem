package arrayproblem;

import java.util.Scanner;

// Find maximum element in the array ?

public class max_element {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){

            arr[i] = sc.nextInt();
        }
        
        int max = arr[0];

        for(int i = 0; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println("Maximum element is  : "+max);

        sc.close();
    }
}

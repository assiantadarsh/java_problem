package arrayproblem;

import java.util.Scanner;

public class check_palindrome_array {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int i = 0;
        int j = n - 1;

        while (i < j) {
            if(arr[i] != arr[j]){
                System.out.println("Not a palindrome");
                 return;
            }
            i++;
            j--;
        }

        System.out.println("Palindrome");

        sc.close();
    }
}
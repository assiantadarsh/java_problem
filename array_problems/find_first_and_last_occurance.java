package arrayproblem;

import java.util.Scanner;

public class find_first_and_last_occurance {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Target : ");
        int target = sc.nextInt();

        int i = 0;
        int j = n -1;

        int first = -1;
        int last = -1;

        while(i < n){

            if(arr[i] == target){
                first = i;
                break;
            }
            i++;
        }
        while(j >= 0){
            if(arr[j] == target){
                last = j;
                break;
            }
            j--;
        }

        if(first == -1 && last == -1){
            System.out.println("Target is not found");
        }

        else{
            System.out.println("First : "+first);
            System.out.println("Last : "+last);
        }

        sc.close();
    }
}

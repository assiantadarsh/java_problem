package arrayproblem;

import java.util.Scanner;

/**
 * count_0_pos_neg_num
 */
public class count_0_pos_neg_num{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int count_zero = 0;
        int count_pos = 0;
        int count_neg = 0;

        for(int i = 0; i < n; i++){

            if(arr[i] == 0){
                count_zero += 1;
            }

            else if(arr[i] > 0){
                count_pos += 1;
            }

            else{
                count_neg += 1;
            }

        }

        System.out.println("Zero : "+count_zero);
        System.out.println("Positive : "+count_pos);
        System.out.println("Negative : "+count_neg);

        sc.close();
    }
}
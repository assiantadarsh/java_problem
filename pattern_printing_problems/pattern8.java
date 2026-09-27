package lec3;

import java.util.Scanner;

//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 

public class pattern8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of n : ");

        int n = sc.nextInt();

        int i = 1;

        while(i <= n){

            int k = 1;

            while( k <= n - i){
                System.out.print(" ");
                k++;
            }

            int j = 1;

            while(j <= i){
                System.out.print("* ");
                j++;
            }

            System.out.println();
            i++; 
        }

        sc.close();
    }
}

package lec3;

import java.util.Scanner;

// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of n : ");

        int n = sc.nextInt();

        int i = 1;
        int space = 0;

        while(i <= n){

            int k = 1;

            while( k <= space){
                System.out.print(" ");
                k++;
            }

            int j = 1;

            while(j <= n - i + 1){
                System.out.print("* ");
                j++;
            }
            space++;
            System.out.println();
            i++; 
        }

        sc.close();
    }
}

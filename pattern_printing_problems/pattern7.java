package lec3;

import java.util.Scanner;

//  * * * * *
//      * * * *
//          * * *
//              * *
//                  *

class pattern7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of n : ");

        int n = sc.nextInt();

        int i = 1;
        int space = 0;

        while(i <= n){

            int k = 0;

            while( k < space){
                System.out.print("  ");
                k++;
            }

            int j = 1;

            while(j <= n - i + 1){
                System.out.print(" *");
                j++;
            }

            System.out.println();
            i++;
            space += 2; 
        }

        sc.close();
    }
}
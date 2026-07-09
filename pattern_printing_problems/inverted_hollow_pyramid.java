package pattern_problem;

import java.util.Scanner;

public class inverted_hollow_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");

        int n = sc.nextInt();

        int nsp = 1;

        for(int i = n ; i >= 1;i--){

            if(i == n){
                for(int j = 1; j <= 2 * n - 1; j++){
                    System.out.print("*");

                }
            }
            else{
                for(int k = 1; k <= nsp; k++){
                    System.out.print(" ");
                }
                nsp++;
                System.out.print("*");

                for(int k = 1; k <= 2 * i - 3;k++){
                    System.out.print("#");
                }

                if(i != 1){
                    System.out.print("*");
                }
            }

            System.out.print("\n");

        }

        sc.close();
    }
}

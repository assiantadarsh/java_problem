package pattern_problem;

import java.util.Scanner;

// *********
// *   *   *
// *   *   *
// *   *   *
// *********
// *   *   *
// *   *   *
// *   *   *
// *********  print the pattern for n = 9 ?

public class hollow_plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the row : ");
        int n = sc.nextInt();

        int pos = (n + 1)/2;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){

                if(i == 1 || i == pos || i == n){
                    System.out.print("*");
                }
                else if(j == 1 || j == pos || j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        sc.close();
    }
}

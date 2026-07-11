package pattern_problem;

import java.util.Scanner;

//     A
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA

public class palindrome_alphabet_pyramid {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the row : ");
        int n = sc.nextInt();

        for(int i = 1 ; i <= n; i++){

            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }

            for(int k = 1; k <= i; k++){
                int d = 64 + k;
                char ch = (char)d;
                System.out.print(ch);
            }

            for(int j = i - 1; j >= 1; j--){
                int d = 64 + j;
                char ch = (char)d;
                System.out.print(ch);
            }

            System.out.print("\n");
        }
        sc.close();

    }
}

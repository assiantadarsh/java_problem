package pattern_problem;
import java.util.Scanner;

//     *
//    ***
//   *****
//  *******
// *********

public class pyramid_star_4 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the positive value of n : ");

        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Not possible please enter positive value ..");
        }
        int nsp = 1;
        for(int i = 1; i<= n;i++){

            for(int k = 1;k <= n-i;k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= nsp;j++){
                System.out.print("*");
            }
            System.out.print("\n");
            nsp += 2;
        }
        sc.close();
    }
}

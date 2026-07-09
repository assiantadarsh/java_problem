package pattern_problem;
import java.util.Scanner;

/**
 * hollow_pyramid
 */
public class hollow_pyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of row : ");

        int n = sc.nextInt();
        int s  = 1;

        for(int i = 1; i <= n; i++){

            if(i == n){
                for(int j = 1; j <= 2 * n - 1; j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j = 1 ; j <= n - i; j++){

                    System.out.print(" ");
            }

                System.out.print("*");

                if(i != 1){

                    for(int k = 1; k <= s; k++ ){
                        System.out.print(" ");
                }
                

                    System.out.print("*");
                    s += 2;
            }

            }
            System.out.print("\n");
        }
        sc.close();
    }

}
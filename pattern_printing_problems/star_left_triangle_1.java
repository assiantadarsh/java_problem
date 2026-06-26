package pattern_problem;
import java.util.Scanner;

// * 
// * * 
// * * * 
// * * * * 
// * * * * * print pattern for n = 5;

public class star_left_triangle_1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the positive value of n : ");

        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Not possible please enter positive value ..");
        }

        for(int i = 1; i<= n;i++){
            for(int j = 1; j <= i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}

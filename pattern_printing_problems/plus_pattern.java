package pattern_problem;

import java.util.Scanner;

public class plus_pattern {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the row : ");
        int n = sc.nextInt();

        int pos = (n + 1)/2;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == pos || j == pos){
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

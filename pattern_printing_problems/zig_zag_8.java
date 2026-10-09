package pattern_problem;

// import java.util.Scanner;

//  *   *  
//  * * * * 
// *   *   *

public class zig_zag_8 {
    public static void main(String[] args) {

        for(int i  =  1 ; i <= 3; i++){
            for(int j = 1; j <= 9 ; j++){
                if(i == 1 || i == 3){
                    if((i + j) % 4 == 0){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    if(j % 2 == 0){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                
            }
            System.out.print("\n");
        }
    }
}

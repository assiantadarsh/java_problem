import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;

        k = k % arr.length;

        for(int r = 0; r < k; r++) {
            int last = arr[arr.length - 1];

            for(int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = last;
        }

        System.out.println(Arrays.toString(arr));
    }
          }

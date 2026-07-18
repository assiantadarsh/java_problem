public class Main {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};

        boolean sorted = true;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                sorted = false;
                break;
            }
        }

        System.out.println(sorted);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        int sum = 0;

        for (int num : arr)
            sum += num;

        double avg = (double) sum / arr.length;

        System.out.println(avg);
    }
}

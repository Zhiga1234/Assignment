import java.util.Scanner;

public class FindAver {
    public static double findAvg(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        double sum = findAvg(arr, n - 1) * (n - 1) + arr[n - 1];
        return sum / n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        double avg = findAvg(arr, n);
        System.out.println(avg);
        sc.close();
    }
}
import java.sql.SQLOutput;
import java.util.Scanner;

public class FindMin {
    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int min = findMin(arr, n - 1);
        if (arr[n - 1] < min) {
            min = arr[n - 1];
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = findMin(arr, n);
        System.out.println(min);
    }
}
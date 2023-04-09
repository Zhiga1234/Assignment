import java.util.Scanner;

public class BinCoe {

        public static int binomialCoeff(int n, int k) {
            if (k == 0 || k == n) {
                return 1;
            }
            return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int result = binomialCoeff(n, k);
            System.out.println(result);
            sc.close();
        }
    }


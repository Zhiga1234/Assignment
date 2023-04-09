import java.util.Scanner;

public class CheckDig {
        public static boolean AllDigits(String s) {
            if (s.length() == 0) {
                return true;
            }
            char c = s.charAt(0);
            if (c >= '0' && c <= '9') {
                return AllDigits(s.substring(1));
            } else {
                return false;
            }
        }
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           String s = sc.nextLine();
           if (AllDigits(s)) {
               System.out.println("YEES");
        } else {
               System.out.println("NO");
           }
           sc.close();
    }
}

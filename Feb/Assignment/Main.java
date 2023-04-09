import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        generatePermutations(str.toCharArray(), 0);
        sc.close();
    }

    public static void generatePermutations(char[] chars, int index) {
        if (index == chars.length - 1) {
            System.out.println(new String(chars));
            return;
        }
        for (int i = index; i < chars.length; i++) {
            if (i != index && chars[i] == chars[index]) {
                continue;
            }
            swap(chars, index, i);
            generatePermutations(chars, index + 1);
            swap(chars, index, i);
        }
    }

    public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
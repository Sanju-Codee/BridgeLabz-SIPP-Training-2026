import java.util.Arrays;
import java.util.Scanner;

public class UniqueCharactersLevel3 {
    public static int lengthWithoutLength(String s) {
        int c = 0;
        try { while (true) { s.charAt(c); c++; } } catch (IndexOutOfBoundsException e) {}
        return c;
    }

    public static char[] uniqueChars(String s) {
        int n = lengthWithoutLength(s);
        char[] temp = new char[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            boolean seen = false;
            for (int j = 0; j < i; j++) if (s.charAt(j) == ch) { seen = true; break; }
            if (!seen) temp[k++] = ch;
        }
        return Arrays.copyOf(temp, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();
        char[] uniq = uniqueChars(text);
        System.out.println("Unique characters:");
        for (char c : uniq) System.out.print(c + " ");
        System.out.println();
        sc.close();
    }
}

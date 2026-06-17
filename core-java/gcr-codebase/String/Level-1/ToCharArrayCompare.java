import java.util.Arrays;
import java.util.Scanner;

public class ToCharArrayCompare {
    public static char[] toCharArrayCustom(String s) {
        char[] out = new char[s.length()];
        for (int i = 0; i < s.length(); i++) out[i] = s.charAt(i);
        return out;
    }

    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        char[] custom = toCharArrayCustom(text);
        char[] builtin = text.toCharArray();
        System.out.println("Custom equals builtin: " + compareCharArrays(custom, builtin));
        System.out.println("Arrays.equals: " + Arrays.equals(custom, builtin));
        sc.close();
    }
}

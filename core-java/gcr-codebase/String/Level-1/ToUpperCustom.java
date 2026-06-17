import java.util.Scanner;

public class ToUpperCustom {
    public static String toUpperByCharAt(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') sb.append((char) (c - 32));
            else sb.append(c);
        }
        return sb.toString();
    }

    public static boolean compareByCharAt(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full text (use nextLine):");
        String text = sc.nextLine();
        String custom = toUpperByCharAt(text);
        String builtin = text.toUpperCase();
        System.out.println("Custom: " + custom);
        System.out.println("Builtin: " + builtin);
        System.out.println("Equal by charAt compare: " + compareByCharAt(custom, builtin));
        sc.close();
    }
}

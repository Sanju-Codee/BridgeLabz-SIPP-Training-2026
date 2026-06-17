import java.util.Scanner;

public class SubstringCharAt {
    public static String substringByCharAt(String s, int start, int end) {
        if (start < 0) start = 0;
        if (end > s.length()) end = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) sb.append(s.charAt(i));
        return sb.toString();
    }

    public static boolean compareByCharAt(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String subByCharAt = substringByCharAt(text, start, end);
        String subBuiltin;
        try {
            subBuiltin = text.substring(start, end);
        } catch (Exception e) {
            subBuiltin = "(substring threw: " + e.getClass().getSimpleName() + ")";
        }

        System.out.println("substringByCharAt: " + subByCharAt);
        System.out.println("substring(): " + subBuiltin);
        System.out.println("Equal by charAt compare: " + compareByCharAt(subByCharAt, subBuiltin));
        sc.close();
    }
}

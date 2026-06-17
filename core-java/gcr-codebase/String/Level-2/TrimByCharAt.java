import java.util.Scanner;

public class TrimByCharAt {
    public static int[] findTrimPoints(String s) {
        int start = 0;
        while (start < s.length() && s.charAt(start) == ' ') start++;
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    public static String substringByCharAt(String s, int start, int end) {
        if (start > end) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) sb.append(s.charAt(i));
        return sb.toString();
    }

    public static boolean compareByCharAt(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text (with leading/trailing spaces):");
        String text = sc.nextLine();
        int[] points = findTrimPoints(text);
        String customTrim = substringByCharAt(text, points[0], points[1] >= points[0] ? points[1] : points[0] - 1);
        String builtin = text.trim();
        System.out.println("Custom trim: '" + customTrim + "'");
        System.out.println("Builtin trim: '" + builtin + "'");
        System.out.println("Match: " + compareByCharAt(customTrim, builtin));
        sc.close();
    }
}

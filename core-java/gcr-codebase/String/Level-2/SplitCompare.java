import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitCompare {
    public static String[] splitByCharAt(String text) {
        List<String> words = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                if (sb.length() > 0) {
                    words.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(c);
            }
        }
        if (sb.length() > 0) words.add(sb.toString());
        return words.toArray(new String[0]);
    }

    public static boolean compareStringArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String line = sc.nextLine();
        String[] custom = splitByCharAt(line);
        String[] builtin = line.trim().isEmpty() ? new String[0] : line.split("\\s+");
        System.out.println("Custom split result:");
        for (String w : custom) System.out.println(w);
        System.out.println("Builtin split result:");
        for (String w : builtin) System.out.println(w);
        System.out.println("Match: " + compareStringArrays(custom, builtin));
        sc.close();
    }
}

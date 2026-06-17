import java.util.Scanner;

public class CharFrequencyUsingUniqueLevel3 {
    public static char[] uniqueChars(String s) {
        java.util.List<Character> list = new java.util.ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean found = false;
            for (char x : list) if (x == c) { found = true; break; }
            if (!found) list.add(c);
        }
        char[] out = new char[list.size()];
        for (int i = 0; i < list.size(); i++) out[i] = list.get(i);
        return out;
    }

    public static String[][] frequencyUsingUnique(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        char[] uniq = uniqueChars(s);
        String[][] out = new String[uniq.length][2];
        for (int i = 0; i < uniq.length; i++) {
            out[i][0] = String.valueOf(uniq[i]);
            out[i][1] = String.valueOf(freq[uniq[i]]);
        }
        return out;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();
        String[][] res = frequencyUsingUnique(text);
        System.out.println("Char\tFreq");
        for (String[] r : res) System.out.println(r[0] + "\t" + r[1]);
        sc.close();
    }
}

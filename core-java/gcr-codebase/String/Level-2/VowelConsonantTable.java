import java.util.Scanner;

public class VowelConsonantTable {
    public static String typeOfChar(char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
            char lc = (c >= 'A' && c <= 'Z') ? (char) (c + 32) : c;
            if (lc == 'a' || lc == 'e' || lc == 'i' || lc == 'o' || lc == 'u') return "Vowel";
            return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] classifyChars(String s) {
        String[][] out = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            out[i][0] = String.valueOf(c);
            out[i][1] = typeOfChar(c);
        }
        return out;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Char\tType");
        for (String[] row : table) System.out.println(row[0] + "\t" + row[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();
        String[][] table = classifyChars(text);
        displayTable(table);
        sc.close();
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CharFrequencyLevel3 {
    public static String[][] charFrequencies(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) list.add(new String[]{String.valueOf((char) i), String.valueOf(freq[i])});
        }
        String[][] out = new String[list.size()][2];
        return list.toArray(out);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();
        String[][] freq = charFrequencies(text);
        System.out.println("Char\tFreq");
        for (String[] row : freq) System.out.println(row[0] + "\t" + row[1]);
        sc.close();
    }
}

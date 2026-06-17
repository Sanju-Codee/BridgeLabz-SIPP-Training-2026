import java.util.Scanner;

public class VowelConsonantCount {
    public static boolean isLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public static boolean isVowel(char c) {
        char lc = (c >= 'A' && c <= 'Z') ? (char) (c + 32) : c;
        return lc == 'a' || lc == 'e' || lc == 'i' || lc == 'o' || lc == 'u';
    }

    public static int[] countVowelsConsonants(String s) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isLetter(c)) {
                if (isVowel(c)) vowels++; else consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();
        int[] res = countVowelsConsonants(text);
        System.out.println("Vowels: " + res[0]);
        System.out.println("Consonants: " + res[1]);
        sc.close();
    }
}

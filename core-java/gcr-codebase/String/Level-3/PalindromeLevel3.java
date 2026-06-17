import java.util.Scanner;

public class PalindromeLevel3 {
    public static boolean isPalindromeIterative(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindromeRecursive(s, start + 1, end - 1);
    }

    public static boolean isPalindromeUsingReverse(String s) {
        char[] rev = new char[s.length()];
        for (int i = 0; i < s.length(); i++) rev[i] = s.charAt(s.length() - 1 - i);
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) if (arr[i] != rev[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String txt = sc.nextLine();
        System.out.println("Iterative: " + isPalindromeIterative(txt));
        System.out.println("Recursive: " + isPalindromeRecursive(txt, 0, txt.length() - 1));
        System.out.println("Reverse-compare: " + isPalindromeUsingReverse(txt));
        sc.close();
    }
}

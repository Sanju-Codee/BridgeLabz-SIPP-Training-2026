import java.util.Scanner;

public class LengthWithoutLength {
    public static int lengthWithoutLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // reached end
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
        int custom = lengthWithoutLength(s);
        int builtin = s.length();
        System.out.println("Custom length: " + custom);
        System.out.println("String.length(): " + builtin);
        System.out.println("Match: " + (custom == builtin));
        sc.close();
    }
}

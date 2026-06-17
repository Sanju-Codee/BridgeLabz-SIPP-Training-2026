import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generate(String s, int start, int end) {
        // Explicitly throw IllegalArgumentException when start > end
        if (start > end) throw new IllegalArgumentException("start index greater than end index");
        // otherwise call substring normally
        System.out.println("Substring: " + s.substring(start, end));
    }

    public static void handle(String s, int start, int end) {
        try {
            generate(s, start, end);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        System.out.println("Calling handler:");
        handle(s, start, end);
        sc.close();
    }
}

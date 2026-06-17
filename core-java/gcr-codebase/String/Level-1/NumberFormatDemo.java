import java.util.Scanner;

public class NumberFormatDemo {
    public static void generate(String text) {
        // this may throw NumberFormatException
        int v = Integer.parseInt(text);
        System.out.println("Parsed value: " + v);
    }

    public static void handle(String text) {
        try {
            generate(text);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to parse as integer: ");
        String text = sc.next();
        System.out.println("Calling handler:");
        handle(text);
        sc.close();
    }
}

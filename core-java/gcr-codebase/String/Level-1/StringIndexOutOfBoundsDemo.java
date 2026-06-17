import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void generate(String s) {
        // access beyond length to generate StringIndexOutOfBoundsException
        char c = s.charAt(s.length());
        System.out.println(c);
    }

    public static void handle(String s) {
        try {
            generate(s);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        System.out.println("Calling handler (will catch exception):");
        handle(s);
        sc.close();
    }
}

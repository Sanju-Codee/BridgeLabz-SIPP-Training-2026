import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void generate(String[] arr) {
        // access out of bounds
        System.out.println(arr[arr.length]);
    }

    public static void handle(String[] arr) {
        try {
            generate(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many names?: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }
        System.out.println("Calling handler:");
        handle(names);
        sc.close();
    }
}

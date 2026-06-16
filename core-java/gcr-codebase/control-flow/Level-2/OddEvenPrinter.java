import java.util.Scanner;

public class OddEvenPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        int number = sc.nextInt();
        if (number < 1) {
            System.out.println("Please enter a natural number (> 0)");
            sc.close();
            return;
        }
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) System.out.println(i + " is even number");
            else System.out.println(i + " is odd number");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (!sc.hasNextInt()) { System.out.println("Invalid input"); sc.close(); return; }
        int number = sc.nextInt();
        int n = Math.abs(number);
        if (n == 0) {
            System.out.println("Number of digits: 1");
            sc.close();
            return;
        }
        int count = 0;
        while (n != 0) { n /= 10; count++; }
        System.out.println("Number of digits: " + count);
        sc.close();
    }
}

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer (>1): ");
        if (!sc.hasNextInt()) { System.out.println("Invalid input"); sc.close(); return; }
        int n = sc.nextInt();
        if (n <= 1) { System.out.println(n + " is not prime"); sc.close(); return; }

        boolean isPrime = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) { isPrime = false; break; }
        }
        System.out.println(n + (isPrime ? " is a prime number" : " is NOT a prime number"));
        sc.close();
    }
}

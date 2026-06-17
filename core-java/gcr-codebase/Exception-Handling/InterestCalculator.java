import java.util.Scanner;

public class InterestCalculator {
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) throw new IllegalArgumentException("Negative input");
        return amount * rate * years / 100.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Rate (%): ");
        double rate = sc.nextDouble();
        System.out.print("Years: ");
        int years = sc.nextInt();
        try {
            double interest = calculateInterest(amount, rate, years);
            System.out.println("Interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        } finally {
            sc.close();
        }
    }
}

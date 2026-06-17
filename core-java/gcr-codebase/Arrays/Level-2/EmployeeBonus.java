import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = 10;
        double[] salary = new double[N];
        double[] years = new double[N];
        double[] bonus = new double[N];
        double[] newSalary = new double[N];

        System.out.println("Enter salary and years of service for 10 employees:");
        for (int i = 0; i < N; i++) {
            System.out.printf("Employee %d salary: ", i + 1);
            double s = sc.nextDouble();
            System.out.printf("Employee %d years of service: ", i + 1);
            double y = sc.nextDouble();
            if (s <= 0 || y < 0) {
                System.out.println("Invalid input. Salary must be > 0 and years must be >= 0. Try again.");
                i--;
                continue;
            }
            salary[i] = s;
            years[i] = y;
        }

        double totalBonus = 0, totalOld = 0, totalNew = 0;
        for (int i = 0; i < N; i++) {
            double rate = (years[i] > 5) ? 0.05 : 0.02;
            bonus[i] = salary[i] * rate;
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOld += salary[i];
            totalNew += newSalary[i];
        }

        System.out.println("\nResults:");
        for (int i = 0; i < N; i++) {
            System.out.printf("Employee %d: Old=%.2f, Bonus=%.2f, New=%.2f\n", i + 1, salary[i], bonus[i], newSalary[i]);
        }
        System.out.printf("\nTotal bonus payout: %.2f\n", totalBonus);
        System.out.printf("Total old salary: %.2f\n", totalOld);
        System.out.printf("Total new salary: %.2f\n", totalNew);
        sc.close();
    }
}

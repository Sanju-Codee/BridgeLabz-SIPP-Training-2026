import java.util.Scanner;

public class TriangularRun {
    public static int roundsFor5Km(double a, double b, double c) {
        double perimeter = a + b + c; // in meters
        if (perimeter <= 0) return 0;
        double rounds = 5000.0 / perimeter;
        return (int) Math.ceil(rounds);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side a (meters): ");
        double a = sc.nextDouble();
        System.out.print("Enter side b (meters): ");
        double b = sc.nextDouble();
        System.out.print("Enter side c (meters): ");
        double c = sc.nextDouble();
        int rounds = roundsFor5Km(a, b, c);
        System.out.println("Number of rounds to complete 5 km: " + rounds);
        sc.close();
    }
}

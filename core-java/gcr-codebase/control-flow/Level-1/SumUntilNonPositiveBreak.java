import java.util.Scanner;

public class SumUntilNonPositiveBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            double v = input.nextDouble();
            if (v <= 0.0) break;
            total += v;
        }
        System.out.printf("Total is %.2f%n", total);
        input.close();
    }
}

import java.util.Scanner;

public class SumNUsingFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 1) {
            System.out.printf("The number %d is not a natural number%n", n);
            input.close();
            return;
        }
        long formula = (long) n * (n + 1) / 2;
        long sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.printf("Formula result: %d, For-loop result: %d, Match: %b%n", formula, sum, formula == sum);
        input.close();
    }
}

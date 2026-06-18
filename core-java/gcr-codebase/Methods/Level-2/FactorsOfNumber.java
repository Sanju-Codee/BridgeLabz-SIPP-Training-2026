import java.util.Scanner;

public class FactorsOfNumber {
    public static int[] findFactors(int n) {
        if (n == 0) return new int[0];
        int count = 0;
        int absN = Math.abs(n);
        for (int i = 1; i <= absN; i++) {
            if (absN % i == 0) count++;
        }
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= absN; i++) {
            if (absN % i == 0) factors[idx++] = i;
        }
        return factors;
    }

    public static long sum(int[] arr) {
        long s = 0;
        for (int v : arr) s += v;
        return s;
    }

    public static long product(int[] arr) {
        long p = 1;
        for (int v : arr) p *= v;
        return p;
    }

    public static long sumOfSquares(int[] arr) {
        long s = 0;
        for (int v : arr) s += Math.pow(v, 2);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] factors = findFactors(n);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();
        System.out.println("Sum of factors: " + sum(factors));
        System.out.println("Product of factors: " + product(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
        sc.close();
    }
}

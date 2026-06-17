import java.util.Scanner;

public class LargestSecondLargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        num = Math.abs(num);

        final int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int idx = 0;
        while (num != 0 && idx < maxDigit) {
            digits[idx++] = (int) (num % 10);
            num /= 10;
        }
        if (idx == 0) {
            System.out.println("No digits entered (input was 0). Largest = 0, second largest = 0");
            sc.close();
            return;
        }

        int largest = -1, second = -1;
        for (int i = 0; i < idx; i++) {
            int d = digits[i];
            if (d > largest) {
                second = largest;
                largest = d;
            } else if (d > second && d != largest) {
                second = d;
            }
        }

        System.out.printf("Largest: %d\n", largest);
        System.out.printf("Second Largest: %d\n", (second >= 0 ? second : largest));
        sc.close();
    }
}

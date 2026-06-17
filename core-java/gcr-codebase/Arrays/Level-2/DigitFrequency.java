import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        num = Math.abs(num);

        List<Integer> digits = new ArrayList<>();
        if (num == 0) digits.add(0);
        while (num != 0) {
            digits.add((int) (num % 10));
            num /= 10;
        }

        int[] freq = new int[10];
        for (int d : digits) freq[d]++;

        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d : %d\n", i, freq[i]);
        }
        sc.close();
    }
}

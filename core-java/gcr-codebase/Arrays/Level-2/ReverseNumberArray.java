import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        long orig = num;
        num = Math.abs(num);

        List<Integer> digits = new ArrayList<>();
        if (num == 0) digits.add(0);
        while (num != 0) {
            digits.add((int) (num % 10));
            num /= 10;
        }

        System.out.print("Reversed digits: ");
        for (int d : digits) System.out.print(d);
        if (orig < 0) System.out.print(" (negative input)");
        System.out.println();
        sc.close();
    }
}

import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int r1 = a + b * c;
        int r2 = a * b + c;
        int r3 = c + a / b; // integer division
        int r4 = a % b + c;
        System.out.printf("The results of Int Operations are %d, %d, %d, and %d%n", r1, r2, r3, r4);
        input.close();
    }
}

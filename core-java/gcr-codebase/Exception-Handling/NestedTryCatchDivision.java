import java.util.Scanner;

public class NestedTryCatchDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i + 1;
        System.out.print("Enter index to access: ");
        int idx = sc.nextInt();
        System.out.print("Enter divisor: ");
        int div = sc.nextInt();

        try {
            int val = arr[idx];
            try {
                int res = val / div;
                System.out.println("Result: " + res);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        } finally {
            sc.close();
        }
    }
}

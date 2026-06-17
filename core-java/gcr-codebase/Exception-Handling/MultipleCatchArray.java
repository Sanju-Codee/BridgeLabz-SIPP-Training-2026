import java.util.Scanner;

public class MultipleCatchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements (0 to simulate null): ");
        int n = sc.nextInt();
        Integer[] arr = null;
        if (n > 0) {
            arr = new Integer[n];
            for (int i = 0; i < n; i++) arr[i] = i * 10;
        }
        System.out.print("Enter index to retrieve: ");
        int idx = sc.nextInt();
        try {
            System.out.println("Value at index " + idx + ": " + arr[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } finally {
            sc.close();
        }
    }
}

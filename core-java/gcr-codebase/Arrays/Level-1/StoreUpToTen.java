import java.util.Scanner;

public class StoreUpToTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        int idx = 0;
        System.out.println("Enter positive numbers (enter 0 or negative to stop). Max 10 entries.");
        while (true) {
            System.out.print("Enter number: ");
            double v = sc.nextDouble();
            if (v <= 0) break;
            arr[idx++] = v;
            if (idx == 10) break;
        }

        double total = 0.0;
        System.out.println("Stored numbers:");
        for (int i = 0; i < idx; i++) {
            System.out.println(arr[i]);
            total += arr[i];
        }
        System.out.println("Sum = " + total);
        sc.close();
    }
}

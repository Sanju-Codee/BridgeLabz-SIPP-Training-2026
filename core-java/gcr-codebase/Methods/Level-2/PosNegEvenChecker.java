import java.util.Scanner;

public class PosNegEvenChecker {
    public static boolean isPositive(int n) { return n > 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int v = arr[i];
            if (isPositive(v)) {
                System.out.print(v + " is positive");
                System.out.println(isEven(v) ? ", even" : ", odd");
            } else if (v < 0) {
                System.out.println(v + " is negative");
            } else {
                System.out.println("0 is neither positive nor negative");
            }
        }
        int cmp = compare(arr[0], arr[arr.length - 1]);
        String msg = (cmp == 1) ? "greater" : (cmp == 0) ? "equal" : "less";
        System.out.println("First element is " + msg + " than last element");
        sc.close();
    }
}

import java.util.Scanner;

public class PosNegEvenOddCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int n : arr) {
            if (n > 0) {
                if (n % 2 == 0) System.out.println(n + " is positive and even");
                else System.out.println(n + " is positive and odd");
            } else if (n < 0) {
                System.out.println(n + " is negative");
            } else {
                System.out.println(n + " is zero");
            }
        }

        int first = arr[0];
        int last = arr[arr.length - 1];
        if (first == last) System.out.println("First element " + first + " is equal to last element " + last);
        else if (first > last) System.out.println("First element " + first + " is greater than last element " + last);
        else System.out.println("First element " + first + " is less than last element " + last);
        sc.close();
    }
}

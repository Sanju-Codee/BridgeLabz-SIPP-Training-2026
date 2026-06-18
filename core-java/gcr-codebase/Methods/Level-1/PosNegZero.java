import java.util.Scanner;

public class PosNegZero {
    public static int checkNumber(int n) {
        if (n > 0) return 1;
        if (n < 0) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int res = checkNumber(n);
        if (res == 1) System.out.println("Positive number");
        else if (res == -1) System.out.println("Negative number");
        else System.out.println("Number is zero");
        sc.close();
    }
}

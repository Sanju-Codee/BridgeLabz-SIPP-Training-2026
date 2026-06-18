import java.util.Scanner;

public class Handshakes {
    public static long maxHandshakes(int n) {
        return (long) n * (n - 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        long shakes = maxHandshakes(n);
        System.out.println("Maximum number of possible handshakes: " + shakes);
        sc.close();
    }
}

import java.util.Scanner;

public class DivideChocolates {
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        if (numberOfChildren <= 0) return new int[]{numberOfChocolates, 0};
        int each = numberOfChocolates / numberOfChildren;
        int remaining = numberOfChocolates % numberOfChildren;
        return new int[]{each, remaining};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();
        int[] res = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + res[0] + " chocolates");
        System.out.println("Remaining chocolates: " + res[1]);
        sc.close();
    }
}

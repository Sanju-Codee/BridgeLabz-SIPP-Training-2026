import java.util.Scanner;

public class FirstIsSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        boolean isSmallest = n1 < n2 && n1 < n3;
        System.out.printf("Is the first number the smallest? %b%n", isSmallest);
        input.close();
    }
}

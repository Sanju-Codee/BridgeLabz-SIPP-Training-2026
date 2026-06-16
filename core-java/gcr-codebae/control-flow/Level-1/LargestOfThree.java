import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        boolean firstLargest = n1 > n2 && n1 > n3;
        boolean secondLargest = n2 > n1 && n2 > n3;
        boolean thirdLargest = n3 > n1 && n3 > n2;
        System.out.printf("Is the first number the largest? %b%n", firstLargest);
        System.out.printf("Is the second number the largest? %b%n", secondLargest);
        System.out.printf("Is the third number the largest? %b%n", thirdLargest);
        input.close();
    }
}

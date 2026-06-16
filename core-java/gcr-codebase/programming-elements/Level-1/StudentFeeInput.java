import java.util.Scanner;

public class StudentFeeInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fee = input.nextDouble();
        double discountPercent = input.nextDouble();
        double discountAmount = fee * discountPercent / 100.0;
        double finalFee = fee - discountAmount;
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f%n", discountAmount, finalFee);
        input.close();
    }
}

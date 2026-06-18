import java.util.Arrays;

public class NumberCheckerTest {
    public static void main(String[] args) {
        long n = 153;
        System.out.println("Number: " + n);
        System.out.println("Digits count: " + NumberChecker.countDigits(n));
        System.out.println("Digits array: " + Arrays.toString(NumberChecker.digitsArray(n)));
        System.out.println("Is Duck: " + NumberChecker.isDuckNumber(1023));
        System.out.println("Is Armstrong (153): " + NumberChecker.isArmstrong(153));
        int[] arr = {3, 9, 1, 7, 9};
        System.out.println("Largest and second: " + Arrays.toString(NumberChecker.largestAndSecondLargest(arr)));
        System.out.println("Smallest and second smallest: " + Arrays.toString(NumberChecker.smallestAndSecondSmallest(arr)));
        System.out.println("Sum digits of 9474: " + NumberChecker.sumDigits(9474));
        System.out.println("Sum squares of 23: " + NumberChecker.sumSquares(23));
        System.out.println("Is Harshad (21): " + NumberChecker.isHarshad(21));
        System.out.println("Digit frequency of 122333: ");
        int[][] freq = NumberChecker.digitFrequency(122333);
        for (int[] r : freq) System.out.println(Arrays.toString(r));
        System.out.println("Reverse digits of 12345: " + Arrays.toString(NumberChecker.reverseDigitsArray(NumberChecker.digitsArray(12345))));
        System.out.println("Is palindrome 1221: " + NumberChecker.isPalindrome(1221));
        System.out.println("Is prime 17: " + NumberChecker.isPrime(17));
        System.out.println("Is neon 9: " + NumberChecker.isNeon(9));
        System.out.println("Is spy 1124: " + NumberChecker.isSpy(1124));
        System.out.println("Is automorphic 5: " + NumberChecker.isAutomorphic(5));
        System.out.println("Is buzz 14: " + NumberChecker.isBuzz(14));
        System.out.println("Perfect/Abundant/Deficient for 28: " + NumberChecker.isPerfect(28) + "/" + NumberChecker.isAbundant(28) + "/" + NumberChecker.isDeficient(28));
        System.out.println("Is strong 145: " + NumberChecker.isStrong(145));
        System.out.println("Factors of 28: " + Arrays.toString(NumberChecker.factors(28)));
        System.out.println("Greatest proper factor of 28: " + NumberChecker.greatestProperFactor(28));
        System.out.println("Sum factors of 28: " + NumberChecker.sumFactors(28));
        System.out.println("Product factors of 6: " + NumberChecker.productFactors(6));
        System.out.println("Product cube factors of 6: " + NumberChecker.productCubeFactors(6));
        String[] otps = new String[10];
        for (int i = 0; i < 10; i++) otps[i] = NumberChecker.generateOTP6();
        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        System.out.println("OTPs unique: " + NumberChecker.areUnique(otps));
    }
}

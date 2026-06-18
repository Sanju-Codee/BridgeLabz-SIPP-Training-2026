import java.util.ArrayList;
import java.util.Arrays;

public class NumberChecker {

    public static int countDigits(long n) {
        n = Math.abs(n);
        if (n == 0) return 1;
        int c = 0;
        while (n > 0) { c++; n /= 10; }
        return c;
    }

    public static int[] digitsArray(long n) {
        n = Math.abs(n);
        int len = countDigits(n);
        int[] d = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            d[i] = (int) (n % 10);
            n /= 10;
        }
        return d;
    }

    public static boolean isDuckNumber(long n) {
        int[] d = digitsArray(n);
        for (int x : d) if (x == 0) return true;
        return false;
    }

    public static boolean isArmstrong(long n) {
        int[] d = digitsArray(n);
        int p = d.length;
        long sum = 0;
        for (int x : d) sum += Math.pow(x, p);
        return sum == Math.abs(n);
    }

    public static int[] largestAndSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int v : arr) {
            if (v > max) { second = max; max = v; }
            else if (v > second && v != max) second = v;
        }
        return new int[]{max, second};
    }

    public static int[] smallestAndSecondSmallest(int[] arr) {
        int min = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int v : arr) {
            if (v < min) { second = min; min = v; }
            else if (v < second && v != min) second = v;
        }
        return new int[]{min, second};
    }

    public static int sumDigits(long n) {
        int[] d = digitsArray(n);
        int s = 0; for (int x : d) s += x; return s;
    }

    public static int sumSquares(long n) {
        int[] d = digitsArray(n);
        int s = 0; for (int x : d) s += x * x; return s;
    }

    public static boolean isHarshad(long n) {
        int s = sumDigits(n);
        if (s == 0) return false;
        return Math.abs(n) % s == 0;
    }

    public static int[][] digitFrequency(long n) {
        int[] d = digitsArray(n);
        int[] freq = new int[10];
        for (int x : d) freq[x]++;
        int[][] out = new int[10][2];
        for (int i = 0; i < 10; i++) { out[i][0] = i; out[i][1] = freq[i]; }
        return out;
    }

    public static int[] reverseDigitsArray(int[] arr) {
        int[] r = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < r.length / 2; i++) {
            int tmp = r[i]; r[i] = r[r.length - 1 - i]; r[r.length - 1 - i] = tmp;
        }
        return r;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(long n) {
        int[] d = digitsArray(n);
        int[] r = reverseDigitsArray(d);
        return arraysEqual(d, r);
    }

    public static boolean isPrime(long n) {
        if (n <= 1) return false;
        long up = (long)Math.sqrt(n);
        for (long i = 2; i <= up; i++) if (n % i == 0) return false;
        return true;
    }

    public static boolean isNeon(int n) {
        int sq = n * n;
        return sumDigits(sq) == n;
    }

    public static boolean isSpy(long n) {
        int[] d = digitsArray(n);
        int sum = 0; long prod = 1;
        for (int x : d) { sum += x; prod *= x; }
        return sum == prod;
    }

    public static boolean isAutomorphic(long n) {
        long sq = n * n;
        String s = Long.toString(n);
        return Long.toString(sq).endsWith(s);
    }

    public static boolean isBuzz(long n) {
        return (n % 7 == 0) || (Math.abs(n) % 10 == 7);
    }

    public static int sumProperDivisors(int n) {
        if (n <= 1) return 0;
        int sum = 1; // 1 is proper divisor
        int up = (int)Math.sqrt(n);
        for (int i = 2; i <= up; i++) {
            if (n % i == 0) {
                sum += i;
                int j = n / i;
                if (j != i) sum += j;
            }
        }
        return sum;
    }

    public static boolean isPerfect(int n) { return n > 0 && sumProperDivisors(n) == n; }
    public static boolean isAbundant(int n) { return n > 0 && sumProperDivisors(n) > n; }
    public static boolean isDeficient(int n) { return n > 0 && sumProperDivisors(n) < n; }

    private static long factorial(int x) { long f = 1; for (int i = 2; i <= x; i++) f *= i; return f; }
    public static boolean isStrong(long n) {
        int[] d = digitsArray(n);
        long sum = 0;
        for (int x : d) sum += factorial(x);
        return sum == Math.abs(n);
    }

    public static int[] factors(int n) {
        if (n == 0) return new int[0];
        ArrayList<Integer> list = new ArrayList<>();
        int up = Math.abs(n);
        for (int i = 1; i <= up; i++) if (n % i == 0) list.add(i);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int greatestProperFactor(int n) {
        int[] f = factors(n);
        if (f.length == 0) return 0;
        int max = Integer.MIN_VALUE;
        for (int v : f) if (v != n && v > max) max = v;
        return max == Integer.MIN_VALUE ? 0 : max;
    }

    public static long sumFactors(int n) {
        int[] f = factors(n); long s = 0; for (int v : f) s += v; return s;
    }

    public static long productFactors(int n) {
        int[] f = factors(n); long p = 1; for (int v : f) p *= v; return p;
    }

    public static double productCubeFactors(int n) {
        int[] f = factors(n); double p = 1; for (int v : f) p *= Math.pow(v, 3); return p;
    }

    public static String generateOTP6() {
        int x = (int)(Math.random() * 1_000_000);
        return String.format("%06d", x);
    }

    public static boolean areUnique(String[] arr) {
        for (int i = 0; i < arr.length; i++) for (int j = i+1; j < arr.length; j++) if (arr[i].equals(arr[j])) return false;
        return true;
    }

}

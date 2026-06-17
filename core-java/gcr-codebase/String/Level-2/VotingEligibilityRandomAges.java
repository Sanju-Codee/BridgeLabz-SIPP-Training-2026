import java.util.Random;
import java.util.Scanner;

public class VotingEligibilityRandomAges {
    public static int[] generateRandomAges(int n) {
        Random r = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) ages[i] = 10 + r.nextInt(90); // 10..99
        return ages;
    }

    public static String[][] evaluateVoting(int[] ages) {
        String[][] out = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int a = ages[i];
            boolean can = (a >= 18) && a >= 0;
            if (a < 0) can = false;
            out[i][0] = String.valueOf(a);
            out[i][1] = String.valueOf(can);
        }
        return out;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Age\tCanVote");
        for (String[] row : table) System.out.println(row[0] + "\t" + row[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students (e.g., 10): ");
        int n = sc.nextInt();
        int[] ages = generateRandomAges(n);
        String[][] res = evaluateVoting(ages);
        displayTable(res);
        sc.close();
    }
}

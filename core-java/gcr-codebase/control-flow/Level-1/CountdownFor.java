import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        for (int i = start; i >= 1; i--) {
            System.out.println(i);
        }
        input.close();
    }
}

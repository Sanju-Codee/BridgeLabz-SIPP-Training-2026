import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.println("Enter height of Amar (in cm): ");
        double heightAmar = sc.nextDouble();

        System.out.println("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.println("Enter height of Akbar (in cm): ");
        double heightAkbar = sc.nextDouble();

        System.out.println("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();
        System.out.println("Enter height of Anthony (in cm): ");
        double heightAnthony = sc.nextDouble();

        // youngest
        int youngestAge = ageAmar;
        String youngest = "Amar";
        if (ageAkbar < youngestAge) { youngestAge = ageAkbar; youngest = "Akbar"; }
        if (ageAnthony < youngestAge) { youngestAge = ageAnthony; youngest = "Anthony"; }

        // tallest
        double tallestHeight = heightAmar;
        String tallest = "Amar";
        if (heightAkbar > tallestHeight) { tallestHeight = heightAkbar; tallest = "Akbar"; }
        if (heightAnthony > tallestHeight) { tallestHeight = heightAnthony; tallest = "Anthony"; }

        System.out.println("Youngest friend: " + youngest + " (age " + youngestAge + ")");
        System.out.println("Tallest friend: " + tallest + " (height " + tallestHeight + " cm)");
        sc.close();
    }
}

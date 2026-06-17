import java.util.Scanner;

public class RockPaperScissorsStats {
    private static String computerChoice() {
        double v = Math.random();
        if (v < 1.0/3) return "rock";
        if (v < 2.0/3) return "paper";
        return "scissors";
    }

    private static String winner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if (user.equals("rock") && comp.equals("scissors")) return "User";
        if (user.equals("scissors") && comp.equals("paper")) return "User";
        if (user.equals("paper") && comp.equals("rock")) return "User";
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of games: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[][] table = new String[n][4]; // game,user,comp,result
        int userWins = 0, compWins = 0, draws = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Game " + (i+1) + " - enter your choice (rock/paper/scissors): ");
            String user = sc.nextLine().trim().toLowerCase();
            String comp = computerChoice();
            String res = winner(user, comp);
            table[i][0] = String.valueOf(i+1);
            table[i][1] = user;
            table[i][2] = comp;
            table[i][3] = res;
            if (res.equals("User")) userWins++; else if (res.equals("Computer")) compWins++; else draws++;
        }

        System.out.println("Game\tUser\tComputer\tResult");
        for (String[] r : table) System.out.println(r[0] + "\t" + r[1] + "\t" + r[2] + "\t" + r[3]);

        double userPct = n == 0 ? 0 : (userWins * 100.0 / n);
        double compPct = n == 0 ? 0 : (compWins * 100.0 / n);
        System.out.println();
        System.out.println("User wins: " + userWins + "  Computer wins: " + compWins + "  Draws: " + draws);
        System.out.printf("User win %%: %.2f  Computer win %%: %.2f\n", userPct, compPct);
        sc.close();
    }
}

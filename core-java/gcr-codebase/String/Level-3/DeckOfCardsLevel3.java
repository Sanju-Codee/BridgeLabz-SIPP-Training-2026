import java.util.Scanner;

public class DeckOfCardsLevel3 {
    private static String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    private static String[] suits = {"Hearts","Diamonds","Clubs","Spades"};

    public static String[] initDeck() {
        String[] deck = new String[suits.length * ranks.length];
        int idx = 0;
        for (String s : suits) for (String r : ranks) deck[idx++] = r + " of " + s;
        return deck;
    }

    public static void shuffle(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int rand = i + (int) (Math.random() * (n - i));
            String tmp = deck[i]; deck[i] = deck[rand]; deck[rand] = tmp;
        }
    }

    public static String[][] distribute(String[] deck, int players, int cardsEach) {
        if (players * cardsEach > deck.length) return null;
        String[][] res = new String[players][cardsEach];
        int idx = 0;
        for (int p = 0; p < players; p++) for (int c = 0; c < cardsEach; c++) res[p][c] = deck[idx++];
        return res;
    }

    public static void printPlayers(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.print("Player " + (i+1) + ": ");
            for (int j = 0; j < playersCards[i].length; j++) System.out.print(playersCards[i][j] + "  ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] deck = initDeck();
        shuffle(deck);
        System.out.print("Number of players: ");
        int players = sc.nextInt();
        System.out.print("Cards per player: ");
        int cards = sc.nextInt();
        String[][] dealt = distribute(deck, players, cards);
        if (dealt == null) System.out.println("Cannot distribute: not enough cards.");
        else printPlayers(dealt);
        sc.close();
    }
}

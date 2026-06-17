import java.util.Scanner;

public class ShortestLongestWords {
    public static String[] splitByCharAt(String text) {
        java.util.List<String> words = new java.util.ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                if (sb.length() > 0) { words.add(sb.toString()); sb.setLength(0); }
            } else sb.append(c);
        }
        if (sb.length() > 0) words.add(sb.toString());
        return words.toArray(new String[0]);
    }

    public static int lengthWithoutLength(String s) {
        int count = 0;
        try { while (true) { s.charAt(count); count++; } } catch (IndexOutOfBoundsException e) {}
        return count;
    }

    public static int[] shortestAndLongest(String[] words) {
        if (words.length == 0) return new int[]{-1, -1};
        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < words.length; i++) {
            int len = lengthWithoutLength(words[i]);
            if (len < lengthWithoutLength(words[minIdx])) minIdx = i;
            if (len > lengthWithoutLength(words[maxIdx])) maxIdx = i;
        }
        return new int[]{minIdx, maxIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String line = sc.nextLine();
        String[] words = splitByCharAt(line);
        int[] idx = shortestAndLongest(words);
        if (idx[0] == -1) System.out.println("No words found");
        else {
            System.out.println("Shortest: " + words[idx[0]] + " (length " + lengthWithoutLength(words[idx[0]]) + ")");
            System.out.println("Longest : " + words[idx[1]] + " (length " + lengthWithoutLength(words[idx[1]]) + ")");
        }
        sc.close();
    }
}

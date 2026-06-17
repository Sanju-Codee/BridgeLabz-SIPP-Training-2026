import java.util.Scanner;

public class CharFrequencyNestedLevel3 {
    public static String[] frequencyNested(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int[] freq = new int[n];
        for (int i = 0; i < n; i++) freq[i] = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == '0') continue;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) { freq[i]++; arr[j] = '0'; }
            }
        }
        java.util.List<String> out = new java.util.ArrayList<>();
        for (int i = 0; i < n; i++) if (arr[i] != '0') out.add(arr[i] + ":" + freq[i]);
        return out.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();
        String[] res = frequencyNested(text);
        System.out.println("Char:Freq");
        for (String r : res) System.out.println(r.replace(':', '\t'));
        sc.close();
    }
}

import java.io.*;

public class TryWithResourcesReadFirstLine {
    public static void main(String[] args) {
        File file = new File("info.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            System.out.println(line != null ? line : "");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

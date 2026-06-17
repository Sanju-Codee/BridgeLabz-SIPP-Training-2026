public class NullPointerDemo {
    public static void generateNullPointer() {
        String text = null;
        // this will throw NullPointerException
        int len = text.length();
        System.out.println("Length: " + len);
    }

    public static void handleNullPointer() {
        try {
            generateNullPointer();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException (handled):");
        handleNullPointer();
    }
}

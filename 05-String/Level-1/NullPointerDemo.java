public class NullPointerDemo {
    
    public static void generateNullPointerException() {
        String text = null;
        System.out.println("Length: " + text.length());
    }
    
    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println("Length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Generating Exception ===");
        generateNullPointerException();
        
        System.out.println("\n=== Handling Exception ===");
        handleNullPointerException();
        
        System.out.println("\nProgram continues...");
    }
}

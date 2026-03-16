import java.util.Scanner;

public class IllegalArgumentDemo {
    
    public static void generateIllegalArgumentException(String text, int start, int end) {
        System.out.println("Substring(" + start + "," + end + "): " + text.substring(start, end));
    }
    
    public static void handleIllegalArgumentException(String text, int start, int end) {
        try {
            System.out.println("Substring(" + start + "," + end + "): " + text.substring(start, end));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        
        int start = 5;
        int end = 2;
        
        System.out.println("=== Generating Exception ===");
        generateIllegalArgumentException(text, start, end);
        
        System.out.println("\n=== Handling Exception ===");
        handleIllegalArgumentException(text, start, end);
        
        System.out.println("\nProgram continues...");
        sc.close();
    }
}

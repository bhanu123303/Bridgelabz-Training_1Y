import java.util.Scanner;

public class StringIndexDemo {
    
    public static void generateStringIndexException(String text, int index) {
        System.out.println("Character at index " + index + ": " + text.charAt(index));
    }
    
    public static void handleStringIndexException(String text, int index) {
        try {
            System.out.println("Character at index " + index + ": " + text.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        
        int invalidIndex = text.length() + 1;
        
        System.out.println("=== Generating Exception ===");
        generateStringIndexException(text, invalidIndex);
        
        System.out.println("\n=== Handling Exception ===");
        handleStringIndexException(text, invalidIndex);
        
        System.out.println("\nProgram continues...");
        sc.close();
    }
}

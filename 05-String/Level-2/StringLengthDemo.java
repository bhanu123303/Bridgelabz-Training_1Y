import java.util.Scanner;

public class StringLengthDemo {
    
    public static int getLengthWithoutLengthMethod(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        
        int manualLength = getLengthWithoutLengthMethod(text);
        int builtInLength = text.length();
        
        System.out.println("\n--- Results ---");
        System.out.println("String: \"" + text + "\"");
        System.out.println("Manual length: " + manualLength);
        System.out.println("Built-in length: " + builtInLength);
        System.out.println("They match: " + (manualLength == builtInLength));
        
        sc.close();
    }
}

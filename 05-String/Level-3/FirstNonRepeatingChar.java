import java.util.Scanner;

public class FirstNonRepeatingChar {
    
    public static char findFirstNonRepeating(String text) {
        int[] freq = new int[256];
        
        int len = 0;
        try {
            while (true) {
                char ch = text.charAt(len);
                freq[(int)ch]++;
                len++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (freq[(int)ch] == 1) {
                return ch;
            }
        }
        return '\0';
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        
        char result = findFirstNonRepeating(text);
        
        System.out.println("\n--- Result ---");
        if (result != '\0') {
            System.out.println("First non-repeating: '" + result + "'");
        } else {
            System.out.println("No non-repeating character found");
        }
        
        sc.close();
    }
}

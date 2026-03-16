import java.util.Scanner;

public class UniqueCharsDemo {
    
    public static int getLengthWithoutLength(String text) {
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
    
    public static char[] findUniqueCharacters(String text) {
        int len = getLengthWithoutLength(text);
        char[] allChars = new char[len];
        int uniqueCount = 0;
        
        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                allChars[uniqueCount++] = current;
            }
        }
        
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = allChars[i];
        }
        return uniqueChars;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        
        char[] uniqueChars = findUniqueCharacters(text);
        
        System.out.println("\n--- Results ---");
        System.out.println("Original: \"" + text + "\"");
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
        
        sc.close();
    }
}

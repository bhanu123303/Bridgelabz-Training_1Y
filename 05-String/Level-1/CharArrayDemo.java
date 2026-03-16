import java.util.Scanner;

public class CharArrayDemo {
    
    public static char[] getCharsFromString(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }
    
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        char[] charAtArray = getCharsFromString(text);
        char[] toCharArray = text.toCharArray();
        
        boolean match = compareCharArrays(charAtArray, toCharArray);
        
        System.out.println("\n--- Results ---");
        System.out.println("Original: \"" + text + "\"");
        System.out.print("charAt() array: ");
        for (char c : charAtArray) System.out.print(c + " ");
        System.out.println();
        
        System.out.print("toCharArray(): ");
        for (char c : toCharArray) System.out.print(c + " ");
        System.out.println();
        
        System.out.println("Arrays match: " + match);
        
        sc.close();
    }
}

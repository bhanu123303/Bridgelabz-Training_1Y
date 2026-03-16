 import java.util.*;

public class StringReverse {
    public static String reverseWithCharAt(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
    
    public static String reverseWithStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    
    public static boolean compareWithCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.nextLine();
        
        String charAtRev = reverseWithCharAt(text);
        String sbRev = reverseWithStringBuilder(text);
        boolean match = compareWithCharAt(charAtRev, sbRev);
        
        System.out.println("\n--- Results ---");
        System.out.println("Original: \"" + text + "\"");
        System.out.println("charAt() reverse: \"" + charAtRev + "\"");
        System.out.println("StringBuilder reverse: \"" + sbRev + "\"");
        System.out.println("They match: " + match);
        
        sc.close();
    }
}

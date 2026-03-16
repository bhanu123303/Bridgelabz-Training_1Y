import java.util.Scanner;

public class StringCompareDemo {
    public static boolean compareWithCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        
        boolean charAtResult = compareWithCharAt(str1, str2);
        boolean equalsResult = str1.equals(str2);
        
        System.out.println("\n--- Results ---");
        System.out.println("String 1: \"" + str1 + "\"");
        System.out.println("String 2: \"" + str2 + "\"");
        System.out.println("charAt() method: " + charAtResult);
        System.out.println("equals() method: " + equalsResult);
        System.out.println("Results match: " + (charAtResult == equalsResult));
        
        sc.close();
    }
}

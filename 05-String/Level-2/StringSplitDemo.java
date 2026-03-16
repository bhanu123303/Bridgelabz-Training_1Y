import java.util.Scanner;

public class StringSplitDemo {
    
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
    
    public static String[] splitWithCharAt(String text) {
        int len = getLengthWithoutLength(text);
        int wordCount = 0;
        
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }
        wordCount = (wordCount > 0) ? wordCount + 1 : 1;
        
        String[] words = new String[wordCount];
        int start = 0;
        int wordIndex = 0;
        
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ' || i == len - 1) {
                int end = (i == len - 1) ? len : i;
                String word = "";
                for (int j = start; j < end; j++) {
                    word += text.charAt(j);
                }
                words[wordIndex++] = word;
                start = i + 1;
            }
        }
        return words;
    }
    
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        String[] manualSplit = splitWithCharAt(text);
        String[] builtInSplit = text.split(" ");
        
        boolean match = compareStringArrays(manualSplit, builtInSplit);
        
        System.out.println("\n--- Results ---");
        System.out.println("Original: \"" + text + "\"");
        System.out.print("Manual split: ");
        for (String w : manualSplit) System.out.print("\"" + w + "\" ");
        System.out.println();
        
        System.out.print("split() method: ");
        for (String w : builtInSplit) System.out.print("\"" + w + "\" ");
        System.out.println();
        
        System.out.println("Arrays match: " + match);
        
        sc.close();
    }
}

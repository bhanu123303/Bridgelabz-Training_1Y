import java.util.Scanner;

public class ShortestLongestWord {
    
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
    
    public static String[][] getWordLengths2D(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLengthWithoutLength(words[i]));
        }
        return result;
    }
    
    public static int[] findShortestLongest(String[][] wordLengths) {
        int shortestLen = Integer.MAX_VALUE;
        int longestLen = 0;
        int shortestIdx = 0;
        int longestIdx = 0;
        
        for (int i = 0; i < wordLengths.length; i++) {
            int len = Integer.parseInt(wordLengths[i][1]);
            if (len < shortestLen) {
                shortestLen = len;
                shortestIdx = i;
            }
            if (len > longestLen) {
                longestLen = len;
                longestIdx = i;
            }
        }
        
        return new int[]{shortestIdx, longestIdx};
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        String[] words = splitWithCharAt(text);
        String[][] wordLengths = getWordLengths2D(words);
        int[] indices = findShortestLongest(wordLengths);
        
        int shortestIdx = indices[0];
        int longestIdx = indices[1];
        
        System.out.println("\n--- Results ---");
        System.out.println("Shortest word: \"" + wordLengths[shortestIdx][0] + 
                          "\" (length: " + wordLengths[shortestIdx][1] + ")");
        System.out.println("Longest word: \"" + wordLengths[longestIdx][0] + 
                          "\" (length: " + wordLengths[longestIdx][1] + ")");
        
        sc.close();
    }
}

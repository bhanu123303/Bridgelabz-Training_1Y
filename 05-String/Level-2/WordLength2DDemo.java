import java.util.Scanner;

public class WordLength2DDemo {
    
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
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        String[] words = splitWithCharAt(text);
        String[][] wordLengths = getWordLengths2D(words);
        
        System.out.println("\nWord\t\tLength");
        System.out.println("----\t\t------");
        for (String[] row : wordLengths) {
            int len = Integer.parseInt(row[1]);
            System.out.println(row[0] + "\t\t" + len);
        }
        
        sc.close();
    }
}

import java.util.Scanner;

public class VowelConsonantDisplay {
    
    public static String checkVowelOrConsonant(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }
    
    public static String[][] analyzeStringCharacters(String text) {
        int len = 0;
        try {
            while (true) {
                text.charAt(len);
                len++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        
        String[][] result = new String[len][2];
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkVowelOrConsonant(ch);
        }
        return result;
    }
    
    public static void displayTable(String[][] table) {
        System.out.println("\nCharacter\tType");
        System.out.println("---------\t----");
        for (String[] row : table) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        
        String[][] analysis = analyzeStringCharacters(text);
        displayTable(analysis);
        
        sc.close();
    }
}

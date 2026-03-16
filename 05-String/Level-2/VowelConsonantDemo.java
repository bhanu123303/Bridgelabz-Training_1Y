import java.util.Scanner;

public class VowelConsonantDemo {
    
    public static String checkVowelOrConsonant(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } else if ((ch >= 'a' && ch <= 'z')) {
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }
    
    public static int[] countVowelsConsonants(String text) {
        int vowels = 0;
        int consonants = 0;
        int len = 0;
        try {
            while (true) {
                char ch = text.charAt(len);
                String type = checkVowelOrConsonant(ch);
                if (type.equals("Vowel")) vowels++;
                else if (type.equals("Consonant")) consonants++;
                len++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return new int[]{vowels, consonants};
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        
        int[] counts = countVowelsConsonants(text);
        int vowels = counts[0];
        int consonants = counts[1];
        
        System.out.println("\n--- Results ---");
        System.out.println("String: \"" + text + "\"");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        
        sc.close();
    }
}

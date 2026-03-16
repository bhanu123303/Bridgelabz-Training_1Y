import java.util.Scanner;

public class CharFrequencyDemo {
    
    public static String[][] getCharFrequencies(String text) {
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
        
        String[][] result = new String[len][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char)i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }
        
        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }
        return finalResult;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        
        String[][] frequencies = getCharFrequencies(text);
        
        System.out.println("\nCharacter\tFrequency");
        System.out.println("---------\t---------");
        for (String[] row : frequencies) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
        
        sc.close();
    }
}

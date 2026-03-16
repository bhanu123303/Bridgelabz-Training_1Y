import java.util.Scanner;

public class BMIDemo {
    
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        
        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";
        
        return new String[]{String.format("%.2f", bmi), status};
    }
    
    public static String[][] computeAllBMI(double[][] personData) {
        String[][] result = new String[personData.length][4];
        for (int i = 0; i < personData.length; i++) {
            result[i][0] = String.format("%.1f cm", personData[i][1]);
            result[i][1] = String.format("%.1f kg", personData[i][0]);
            String[] bmiData = calculateBMI(personData[i][0], personData[i][1]);
            result[i][2] = bmiData[0];
            result[i][3] = bmiData[1];
        }
        return result;
    }
    
    public static void displayTable(String[][] data) {
        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        System.out.println("------\t------\t---\t------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "\t" + row[3]);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] personData = new double[10][2];
        
        System.out.println("Enter data for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            personData[i][1] = sc.nextDouble();
            System.out.println();
        }
        
        String[][] bmiTable = computeAllBMI(personData);
        displayTable(bmiTable);
        
        sc.close();
    }
}

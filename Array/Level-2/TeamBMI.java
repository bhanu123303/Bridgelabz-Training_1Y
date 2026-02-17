import java.util.Scanner;

class TeamBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TEAM_SIZE = 5;  
        double[] heights = new double[TEAM_SIZE];  
        double[] weights = new double[TEAM_SIZE]; 
        double[] bmis    = new double[TEAM_SIZE];
        String[] status  = new String[TEAM_SIZE];

        
        for (int i = 0; i < TEAM_SIZE; i++) {
            System.out.println("Person " + (i + 1) + ":");

            System.out.print("Enter height in meters (e.g., 1.75): ");
            heights[i] = sc.nextDouble();

            System.out.print("Enter weight in kg (e.g., 70.5): ");
            weights[i] = sc.nextDouble();

            
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            
            if (bmis[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmis[i] >= 25 && bmis[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }

            System.out.println();
        }

        
        System.out.println("BMI Report for Team:");
        for (int i = 0; i < TEAM_SIZE; i++) {
            System.out.printf("Person %d -> Height: %.2f m, Weight: %.1f kg, BMI: %.2f, Status: %s%n",
                    (i + 1), heights[i], weights[i], bmis[i], status[i]);
        }

        sc.close();
    }
}

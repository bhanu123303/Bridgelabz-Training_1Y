import java.util.Scanner;

class ZaraBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMP_COUNT = 10;
        int[] years = new int[EMP_COUNT];
        double[] oldSalary = new double[EMP_COUNT];
        double[] bonus = new double[EMP_COUNT];
        double[] newSalary = new double[EMP_COUNT];

        double totalBonus = 0;

        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println("Employee " + (i + 1) + ":");

            System.out.print("Enter years of service: ");
            years[i] = sc.nextInt();

            System.out.print("Enter salary: ");
            oldSalary[i] = sc.nextDouble();

                        if (years[i] > 5) {
                bonus[i] = oldSalary[i] * 0.05;
            } else {
                bonus[i] = 0;
            }

            newSalary[i] = oldSalary[i] + bonus[i];
            totalBonus += bonus[i];

            System.out.println();
        }

        System.out.println("Zara Employee Bonus Details:");
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("  Years of service : " + years[i]);
            System.out.println("  Old salary       : " + oldSalary[i]);
            System.out.println("  Bonus            : " + bonus[i]);
            System.out.println("  New salary       : " + newSalary[i]);
            System.out.println();
        }

        System.out.println("Total bonus to be paid by Zara: " + totalBonus);

        sc.close();
    }
}

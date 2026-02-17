import java.util.Scanner;

class FriendsInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();

        System.out.print("Enter height of Amar (cm): ");
        int hAmar = sc.nextInt();
        System.out.print("Enter height of Akbar (cm): ");
        int hAkbar = sc.nextInt();
        System.out.print("Enter height of Anthony (cm): ");
        int hAnthony = sc.nextInt();

        String youngest;
        int youngestAge;

        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            youngest = "Amar";
            youngestAge = ageAmar;
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            youngest = "Akbar";
            youngestAge = ageAkbar;
        } else {
            youngest = "Anthony";
            youngestAge = ageAnthony;
        }

        String tallest;
        int tallestHeight;

        if (hAmar >= hAkbar && hAmar >= hAnthony) {
            tallest = "Amar";
            tallestHeight = hAmar;
        } else if (hAkbar >= hAmar && hAkbar >= hAnthony) {
            tallest = "Akbar";
            tallestHeight = hAkbar;
        } else {
            tallest = "Anthony";
            tallestHeight = hAnthony;
        }

        System.out.println("Youngest Friend: " + youngest + " (Age: " + youngestAge + ")");
        System.out.println("Tallest Friend: " + tallest + " (Height: " + tallestHeight + " cm)");

        sc.close();
    }
}

package UnitConversion;

public class Demo {
    public static double kmToMiles(double km) { return km * 0.621371; }
    public static double milesToKm(double miles) { return miles * 1.60934; }
    public static double kgToLbs(double kg) { return kg * 2.20462; }
    public static double lbsToKg(double lbs) { return lbs * 0.453592; }

    public static void main(String[] args) {
        System.out.println("10 km = " + kmToMiles(10) + " miles");
        System.out.println("100 lbs = " + lbsToKg(100) + " kg");
        System.out.println("50 miles = " + milesToKm(50) + " km");
        System.out.println("75 kg = " + kgToLbs(75) + " lbs");}
}

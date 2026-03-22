package Q2;

public class Car implements Vehicle{
    @Override
    public void rent(int days) {
        System.out.println("Rent per day 250");
        int t=days*250;
        System.out.println(t);
    }

    @Override
    public void returnVehicle() {
        System.out.println("Vehicle Returned sucessfully");
    }
}

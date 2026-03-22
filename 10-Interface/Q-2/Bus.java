package Q2;

public class Bus implements Vehicle{
    @Override
    public void rent(int days) {
        System.out.println("Rent Per day-1000");
        int t=days*1000;
        System.out.println(t);
    }

    @Override
    public void returnVehicle() {
        System.out.println("Vehicle Reteuned Succesfullhy");
    }
}

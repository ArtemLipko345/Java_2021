package inheritance;

public class AirBus implements Plane {

    @Override
    public void fuel() {
        System.out.println("fueling started");
        System.out.println("waiting 30 minutes");
        System.out.println("fueling finished");
    }

    public void transport() {
        System.out.println("Transporting");
    }
}

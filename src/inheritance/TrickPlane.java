package inheritance;

public class TrickPlane implements Plane{

    @Override
    public void fuel() {
        System.out.println("fueling started");
        System.out.println("waiting 10 minutes");
        System.out.println("fueling finished");
    }

    public void barrelRoll() {
        System.out.println("doing a barrel roll");
    }
}

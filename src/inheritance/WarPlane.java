package inheritance;

public class WarPlane implements Plane{

    public int ammunition;

    protected WarPlane(int ammunition){
        this.ammunition = ammunition;
    }

    @Override
    public void fuel() {
        System.out.println("fueling started");
        System.out.println("waiting 15 minutes");
        System.out.println("fueling finished");
    }

    public void shoot() {
        System.out.println("Shooting");
        ammunition--;
        System.out.println("Ammo left: " + ammunition);

    }


}

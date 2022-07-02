package inheritance;

public class Main {
    public static void main(String[] args) {
        AirBus airBus = new AirBus();
        TrickPlane trickPlane = new TrickPlane();
        FighterPlane fighterPlane = new FighterPlane(200);
        SpyPlane spyPlane = new SpyPlane(100);

        airBus.fuel();
        trickPlane.takeOff();
        fighterPlane.shoot();
        spyPlane.shoot();
    }
}

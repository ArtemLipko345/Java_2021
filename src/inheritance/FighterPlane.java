package inheritance;

public class FighterPlane extends WarPlane{
    public FighterPlane(int ammunition) {
        super(ammunition);
    }

    public void rocket(){
        System.out.println("shooting rockets");
    }
}

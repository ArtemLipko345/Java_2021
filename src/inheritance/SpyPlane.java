package inheritance;

public class SpyPlane extends WarPlane{
    public SpyPlane(int ammunition) {
        super(ammunition);
    }

    public void spy(){
        System.out.println("spying");
    }

}

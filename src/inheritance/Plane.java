package inheritance;

public interface Plane {
    default void flight(){
        System.out.println(this.getClass() + " is flying");
    }
    default void takeOff(){
        System.out.println(this.getClass() + " is taking off");
    }
    void fuel();
}



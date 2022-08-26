import org.junit.Test;

public class Q775Test {
    @Test
    public void test1(){
        assert Q775.solve(3,5) == 4;
    }
    @Test
    public void test2(){
        assert Q775.solve(4,9) == -1;
    }
    @Test
    public void test3(){
        assert Q775.solve(1,5) == -1;
    }
}

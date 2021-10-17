import org.junit.Test;

public class Q336Test {
    @Test
    public void test1(){
        String example1 = "11";
        assert Q336.solve(example1) == 3;
    }
    @Test
    public void test2(){
        String example2 = "21212";
        assert Q336.solve(example2) == 2;
    }
    @Test
    public void test3(){
        String example3 = "1221221221221";
        assert Q336.solve(example3) == 6;
    }
}

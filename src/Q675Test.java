import org.junit.Test;

public class Q675Test {
    @Test
    public void Test1(){
        char x[][] = new char[4][6];
        x[0] = new char[]{'A','A','.','B','B','B'};
        x[1] = new char[]{'A','.','.','.','.','B'};
        x[2] = new char[]{'A','A','A','.','B','B'};
        x[3] = new char[]{'A','.','.','.','B','B'};
        int lines = 4;
        int columns = 6;
        assert Q675.solve(lines, columns, x) == 1;

    }
    @Test
    public void Test2(){
        char x[][] = new char[3][5];
        x[0] = new char[]{'A','.','.','.','B'};
        x[1] = new char[]{'A','.','.','B','B'};
        x[2] = new char[]{'A','.','.','.','B'};
        int lines = 3;
        int columns = 5;

        assert Q675.solve(lines, columns, x) == 2;
    }

}

import org.junit.Test;

public class MatrixTest {
    @Test
    public void testMultiplyMatrix(){

        int x[][] = new int[3][3];
        x[0] = new int[]{1, 2, 2};
        x[1] = new int[]{3, 1, 4};
        x[2] = new int[]{2, 6, 5};
        Matrix matrix = new Matrix(3, 3, x);
        int y[][] = new int[3][3];
        y[0] = new int[]{1, 3, 4};
        y[1] = new int[]{4, 2, 5};
        y[2] = new int[]{3, 4, 5};
        Matrix matrix2 = new Matrix(3, 3, y);
        int expected[][] = new int[3][3];
        expected[0] = new int[]{15, 15, 24};
        expected[1] = new int[]{19, 27, 37};
        expected[2] = new int[]{41, 38, 63};
        Matrix expectedMatrix = new Matrix(3, 3, y);
        matrix = matrix.multiply(matrix2);
        checkMatrix(expectedMatrix, matrix);
    }
    private void checkMatrix(Matrix expected, Matrix actual) {
        int mistakes = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(actual.elements[i][j] != expected.elements[i][j]){
                    mistakes++;
                }
            }
        }
        if(mistakes > 0){
            System.out.println("Mistake Found");
            throw new RuntimeException();
        }

    }
}

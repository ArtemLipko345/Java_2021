import java.util.Scanner;
// a.columns == b.lines;
//                                      j
//. . . . . .     . . . . . .     . . . . . .
//. . . . . .     . . . . . .     . . . . . .
//. . . . . .   * . . . . . .  =  . . . c . .  i
//. . . . . .     . . . . . .     . . . . . .
//. . . . . .     . . . . . .     . . . . . .
//. . . . . .     . . . . . .     . . . . . .
//
// c[2][3] = a[2][0] * b[0][3] + a[2][1] * b[1][3] + a[2][2] * b[2][3] + a[2][3] * b[3][3] + a[2][4] * b[4][3] + a[2][5] * b[5][3];
//
// for k in 0..a.columns -1
// c[i][j] += a[i][k] * b[k][j];

public class Matrix {
    public int lines = 0;
    public int columns = 0;
    public int elements[][];

    public Matrix(int lines, int columns, int[][] elements) {
        this.lines = lines;
        this.columns = columns;
        this.elements = elements;
    }

    public Matrix(int lines, int columns) {
        this.lines = lines;
        this.columns = columns;
    }

    public void read(Scanner scanner){
        elements = new int[lines][columns];
        for (int i = 0; i < lines; i++){
            for (int j = 0; j < columns; j++) {
                elements[i][j] = scanner.nextInt();
            }
        }
    }

    public void print(){
        for(int i = 0; i < lines; i++){
            System.out.println();
            for(int j = 0; j < columns; j++){
                System.out.print(elements[i][j] + " ");
            }
        }
        System.out.println();
    }
    public Matrix reverse(){
        int z[][] = new int[lines][columns];

        for(int i = 0; i < lines; i++){
            for(int j = 0; j < columns; j++){
                z[i][j] = elements[j][i];
            }
        }
        return new Matrix(lines, columns, z);
    }

    public Matrix multiply(int number) {
        int z[][] = new int[lines][columns];

        for(int i = 0; i < lines; i++){
            for (int j = 0; j < columns; j++){
                z[i][j] = elements[i][j] * number;
            }
        }
        return new Matrix(lines, columns, z);
    }

    public Matrix subtract(Matrix matrix) {
        int z[][] = new int[lines][columns];

        for (int i = 0; i < lines; i++){
            for (int j = 0; j < columns; j++){
                z[i][j] = elements[i][j] - matrix.elements[i][j];
            }
        }

        return new Matrix(lines, columns, z);
    }
    public Matrix add(Matrix matrix) {
        int z[][] = new int[lines][columns];

        for (int i = 0; i < lines; i++){
            for (int j = 0; j < columns; j++){
                z[i][j] = matrix.elements[i][j] + elements[i][j];
            }
        }

        return new Matrix(lines, columns, z);
    }
    public Matrix multiply(Matrix matrix){
        if(columns != matrix.lines) {
            return null;
        }
        int z[][] = new int[lines][matrix.columns];
//        if (lines == 2 && columns == 2 && matrix.lines == 2 && matrix.columns == 1){
//            z[0][0] = elements[0][0] * matrix.elements[0][0] + elements[0][1] * matrix.elements[1][0];
//            z[1][0] = elements[1][0] * matrix.elements[0][0] + elements[1][1] * matrix.elements[1][0];
//        }
//        if(lines == 2 && columns == 2 && matrix.lines == 2 && matrix.columns == 2) {
//            z[0][0] = elements[0][0] * matrix.elements[0][0] + elements[0][1] * matrix.elements[1][0];
//            z[0][1] = elements[0][0] * matrix.elements[0][1] + elements[0][1] * matrix.elements[1][1];
//            z[1][0] = elements[1][0] * matrix.elements[0][0] + elements[1][1] * matrix.elements[1][0];
//            z[1][1] = elements[1][0] * matrix.elements[0][1] + elements[1][1] * matrix.elements[1][1];
//        }
//        if(lines == 3 && columns == 3 && matrix.lines == 3 && matrix.columns == 1){
//            z[0][0] = elements[0][0] * matrix.elements[0][0] + elements[0][1] * matrix.elements[1][0] + elements[0][2] * matrix.elements[2][0];
//            z[1][0] = elements[1][0] * matrix.elements[0][0] + elements[1][1] * matrix.elements[1][0] + elements[1][2] * matrix.elements[2][0];
//            z[2][0] = elements[2][0] * matrix.elements[0][0] + elements[2][1] * matrix.elements[1][0] + elements[2][2] * matrix.elements[2][0];
//        }
//        if(lines == 2 && columns == 3 && matrix.lines == 3 && matrix.columns == 2){
//            z[0][0] = elements[0][0] * matrix.elements[0][0] + elements[0][1] * matrix.elements[1][0] + elements[0][2] * matrix.elements[2][0];
//            z[0][1] = elements[0][0] * matrix.elements[0][1] + elements[0][1] * matrix.elements[1][1] + elements[0][2] * matrix.elements[2][1];
//            z[1][0] = elements[1][0] * matrix.elements[0][0] + elements[1][1] * matrix.elements[1][0] + elements[1][2] * matrix.elements[2][0];
//            z[1][1] = elements[1][0] * matrix.elements[0][1] + elements[1][1] * matrix.elements[1][1] + elements[1][2] * matrix.elements[2][1];
//        }
        for(int i = 0; i < lines; i++){
            for(int j = 0; j < matrix.columns; j++){
                for (int k = 0; k < columns; k++) {
                    z[i][j] += elements[i][k] * matrix.elements[k][j];
                }
            }
        }

        return new Matrix(lines, matrix.columns, z);
    }
    public static void main(String[] args) {
        Matrix m1, m2, m3, m4, m5;
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        int columns = scanner.nextInt();
        int number = scanner.nextInt();
        m1 = new Matrix(lines, columns);
        m1.read(scanner);
        m2 = new Matrix(lines, columns);
        m2.read(scanner);

        m3 = m1.add(m2);
        m4 = m3.multiply(number);
        m5 = m4.reverse();
        m5.print();
    }
}
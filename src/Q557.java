import java.util.Scanner;

public class Q557 {
//    (a % p + b % p) % p = (a + b) % p;
//    (10 + 12) % 7 =
//    22 % 7 = 1
//    10 % 7 + 12 % 7
//    3 + 5 = 8 % 7 = 1

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

    public static class Matrix {
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
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int size = scanner.nextInt();
        int line = scanner.nextInt();
        int column = scanner.nextInt();
        int module = scanner.nextInt();

        int[][] a = new int[size][size];
        int[][] b = new int[size][size];
        Matrix result = new Matrix(size,size);
        Matrix matrix = new Matrix(size,size);

        for (int i = 0; i < amount; i++) {
            if(i == 0){
                result.read(scanner);
            } else {
                matrix.read(scanner);
                result = result.multiply(matrix);
            }
        }
        System.out.println(result.elements[line - 1][column - 1] % module);
    }
}
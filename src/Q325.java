import java.util.Objects;
import java.util.Scanner;

public class Q325 {

    static final int DELTA_X[] = {1, 1, -1, -1, 2, 2, -2, -2};
    static final int DELTA_Y[] = {2, -2, 2, -2, 1, -1, 1, -1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String all = scanner.nextLine();
        Point a = new Point(all.charAt(0) - 'a' + 1, all.charAt(1) - '1' + 1);
        Point b = new Point(all.charAt(4) - 'a' + 1, all.charAt(5) - '1' + 1);
        boolean x[][] = new boolean[8][8];
        if(moveKnight(a, b, x, 0)){
        } else {
            System.out.println("NO");
        }
    }

    public static boolean moveKnight(Point a, Point b, boolean x[][], int counter){

        if (counter == 3) {
            return false;
        }
        if(a.equals(b) && counter != 0){
            System.out.println(counter);
            return true;
        }
        if(counter != 0){
            x[a.getX() - 1][a.getY() - 1] = true;
        }

        for (int i = 0; i < 8; i++) {
            Point pointA = new Point(a.getX() + DELTA_X[i], a.getY() + DELTA_Y[i]);
            if(pointA.getX() <= 8 && pointA.getX() >= 1 && pointA.getY() <= 8 && pointA.getY() >= 1){

                if(!x[pointA.getX() - 1][pointA.getY() - 1]){
                    if(moveKnight(pointA, b, x, counter + 1)){
                        return true;
                    }
                }

            }
        }
        x[a.getX() - 1][a.getY() - 1] = false;
        return false;
    }

    public static class Point{
        private int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}

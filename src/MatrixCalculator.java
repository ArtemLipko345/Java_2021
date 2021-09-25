import java.util.Scanner;

public class MatrixCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matrix m1, m2;
        int end = 0;

        String action = "";
        int lines = scanner.nextInt();
        int columns = scanner.nextInt();

        m1 = new Matrix(lines, columns);
        m1.read(scanner);

        scanner.nextLine();
        while (true) {
            System.out.println("Введите функцию:");
            action = scanner.nextLine();

            switch (action){
                case "add":
                    m2 = new Matrix(lines, columns);
                    m2.read(scanner);
                    m1 = m1.add(m2);
                    break;
                case "print":
                    m1.print();
                    break;
                case "subtract":
                    m2 = new Matrix(lines, columns);
                    m2.read(scanner);
                    m1 = m1.subtract(m2);
                    break;
                case "multiply":
                    int number = scanner.nextInt();
                    m1 = m1.multiply(number);
                    break;
                case "reverse":
                    if(lines == columns){
                        m1 = m1.reverse();
                    } else {
                        System.out.println("Unable to reverse");
                    }
                    break;
                case "multiply matrix":
                    int lines2 = scanner.nextInt();
                    int columns2 = scanner.nextInt();
                    m2 = new Matrix(lines2, columns2);
                    m2.read(scanner);
                    m1 = m1.multiply(m2);
                    scanner.nextLine();
                    break;
                case "exit":
                    end = 1;
                    break;
                default:
            }
            if(end == 1){
                break;
            }
        }
    }
}

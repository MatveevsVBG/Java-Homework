import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner((System.in));
            System.out.print("Введите число n: ");
            int n = scanner.nextInt();

            // Вычисление треугольного числа
            int triangularNumber = calculateTriangularNumber(n);
            System.out.println("Треугольное число для n = " + n + ": " + triangularNumber);

            // Вычисление факториала
            long factorial = calculateFactorial(n);
            System.out.println("Факториал для n = " + n + ": " + factorial);
        }

        // Метод для вычисления треугольного числа
        public static int calculateTriangularNumber(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        }

        // Метод для вычисления факториала
        public static long calculateFactorial(int n) {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

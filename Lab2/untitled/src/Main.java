import java.util.Scanner;
import java.util.Random;

public class Main {
    private static final int MAX_SIZE = 20; // Максимальний розмір матриці
    private static final int MIN_RANDOM = 1; // Мінімальне випадкове число
    private static final int MAX_RANDOM = 100; // Максимальне випадкове число

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть ширину матриці (не більше 20):");
        int width = scanner.nextInt();

        System.out.println("Введіть висоту матриці (не більше 20):");
        int height = scanner.nextInt();

        if (width > MAX_SIZE || height > MAX_SIZE) {
            System.out.println("Розмір матриці перевищує максимально допустимий розмір.");
            return;
        }

        int[][] matrix;

        System.out.println("Оберіть метод створення матриці:\n1 - Ручний ввід\n2 - Випадкові числа");
        int choice = scanner.nextInt();

        if (choice == 1) {
            matrix = createMatrixManually(width, height, scanner);
        } else if (choice == 2) {
            matrix = createMatrixRandomly(width, height);
        } else {
            System.out.println("Невірний вибір методу створення матриці.");
            return;
        }

        System.out.println("Матриця:");
        printMatrix(matrix);

        int minValue = findMinValue(matrix);
        int maxValue = findMaxValue(matrix);
        double average = calculateAverage(matrix);

        System.out.println("Мінімальне значення: " + minValue);
        System.out.println("Максимальне значення: " + maxValue);
        System.out.println("Середнє арифметичне: " + average);
    }

    private static int[][] createMatrixManually(int width, int height, Scanner scanner) {
        int[][] matrix = new int[height][width];

        System.out.println("Введіть елементи матриці:");

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    private static int[][] createMatrixRandomly(int width, int height) {
        Random random = new Random();
        int[][] matrix = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = random.nextInt(MAX_RANDOM - MIN_RANDOM + 1) + MIN_RANDOM;
            }
        }

        return matrix;
    }

    private static int findMinValue(int[][] matrix) {
        int minValue = matrix[0][0];

        for (int[] row : matrix) {
            for (int element : row) {
                if (element < minValue) {
                    minValue = element;
                }
            }
        }

        return minValue;
    }

    private static int findMaxValue(int[][] matrix) {
        int maxValue = matrix[0][0];

        for (int[] row : matrix) {
            for (int element : row) {
                if (element > maxValue) {
                    maxValue = element;
                }
            }
        }

        return maxValue;
    }

    private static double calculateAverage(int[][] matrix) {
        int sum = 0;
        int count = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
                count++;
            }
        }

        if (count == 0) {
            return 0; // Щоб уникнути ділення на нуль, повертаємо 0 у випадку пустої матриці.
        }

        return (double) sum / count;
    }
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}


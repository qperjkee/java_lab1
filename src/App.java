public class App {

    public static void main(String[] args) {
        char[][] A = {
            {'1', 'b', 'c'},
            {'d', '4', 'z'},
            {'6', 'h', 'i'}
        };

        char[][] B = {
            {'/', 'k', 'l'},
            {'m', 'n', '.'},
            {'p', ',', 'r'}
        };

        try {
            System.out.println("Matrix A: ");
            MatrixUtils.printMatrix(A);

            System.out.println("Matrix B: ");
            MatrixUtils.printMatrix(B);

            int[][] C = MatrixUtils.addMatrices(A, B);

            System.out.println("Result of C = A + B:");
            MatrixUtils.printMatrix(C);

            int sumOfMinElements = MatrixUtils.calculateSumOfMinElements(C);
            System.out.println("Sum of lowest elements in each column of C: " + sumOfMinElements);
        } catch (IllegalArgumentException e) {
            System.err.println("Input error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
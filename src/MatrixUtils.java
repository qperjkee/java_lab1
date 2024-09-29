public class MatrixUtils {

    public static int[][] addMatrices(char[][] A, char[][] B) {
        if (A == null || B == null) {
            throw new IllegalArgumentException("Matrices A and B must not be null");
        }
        if (A.length != B.length || A[0].length != B[0].length) {
            throw new IllegalArgumentException("Matrices A and B must have the same dimensions");
        }

        int rows = A.length;
        int cols = A[0].length;
        int[][] C = new int[rows][cols];

        try {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    C[i][j] = A[i][j] + B[i][j]; 
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error while adding matrices: " + e.getMessage());
        }

        return C;
    }

    public static int calculateSumOfMinElements(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Matrix must not be null or empty");
        }

        int cols = matrix[0].length;
        int sum = 0;

        try {
            for (int j = 0; j < cols; j++) {
                int min = matrix[0][j];
                for (int i = 1; i < matrix.length; i++) {
                    if (matrix[i][j] < min) {
                        min = matrix[i][j];
                    }
                }
                sum += min;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error while calculating sum of minimum elements: " + e.getMessage());
        }

        return sum;
    }

    public static void printMatrix(char[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix must not be null");
        }

        try {
            for (char[] row : matrix) {
                for (char element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println("Error while printing matrix: " + e.getMessage());
        }
    }

    public static void printMatrix(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix must not be null");
        }

        try {
            for (int[] row : matrix) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println("Error while printing matrix: " + e.getMessage());
        }
    }
}
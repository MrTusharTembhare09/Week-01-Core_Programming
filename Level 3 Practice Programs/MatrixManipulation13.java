import java.util.Random;

public class MatrixManipulation13 {

    // Method to create a random matrix with given rows and columns
    public static double[][] createRandomMatrix(int rows, int cols) {
        Random random = new Random();
        double[][] matrix = new double[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextDouble() * 10; // Random values between 0 and 10
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static double[][] addMatrices(double[][] matrix1, double[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        double[][] result = new double[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static double[][] subtractMatrices(double[][] matrix1, double[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        double[][] result = new double[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static double[][] multiplyMatrices(double[][] matrix1, double[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;
        
        if (cols1 != rows2) {
            throw new IllegalArgumentException("Matrix multiplication is not possible. Number of columns of matrix1 must be equal to number of rows of matrix2.");
        }
        
        double[][] result = new double[rows1][cols2];
        
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to find the transpose of a matrix
    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] result = new double[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    // Method to find the determinant of a 2x2 matrix
    public static double determinant2x2(double[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            throw new IllegalArgumentException("Matrix must be 2x2.");
        }
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find the determinant of a 3x3 matrix
    public static double determinant3x3(double[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Matrix must be 3x3.");
        }
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
               matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
               matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(double[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            throw new IllegalArgumentException("Matrix must be 2x2.");
        }
        
        double determinant = determinant2x2(matrix);
        if (determinant == 0) {
            throw new IllegalArgumentException("Matrix is singular and cannot be inverted.");
        }
        
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / determinant;
        inverse[0][1] = -matrix[0][1] / determinant;
        inverse[1][0] = -matrix[1][0] / determinant;
        inverse[1][1] = matrix[0][0] / determinant;
        
        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(double[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Matrix must be 3x3.");
        }
        
        double determinant = determinant3x3(matrix);
        if (determinant == 0) {
            throw new IllegalArgumentException("Matrix is singular and cannot be inverted.");
        }
        
        double[][] adjoint = new double[3][3];
        
        adjoint[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
        adjoint[0][1] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        adjoint[0][2] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];
        
        adjoint[1][0] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]);
        adjoint[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
        adjoint[1][2] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]);
        
        adjoint[2][0] = matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1];
        adjoint[2][1] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]);
        adjoint[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        
        double[][] inverse = new double[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adjoint[i][j] / determinant;
            }
        }
        
        return inverse;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%6.2f ", value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        
        // Creating random matrices
        double[][] matrix1 = createRandomMatrix(rows, cols);
        double[][] matrix2 = createRandomMatrix(rows, cols);
        
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        
        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);

        // Matrix Addition
        double[][] sum = addMatrices(matrix1, matrix2);
        System.out.println("\nMatrix Addition:");
        displayMatrix(sum);
        
        // Matrix Subtraction
        double[][] difference = subtractMatrices(matrix1, matrix2);
        System.out.println("\nMatrix Subtraction:");
        displayMatrix(difference);
        
        // Matrix Multiplication
        double[][] product = multiplyMatrices(matrix1, matrix2);
        System.out.println("\nMatrix Multiplication:");
        displayMatrix(product);
        
        // Matrix Transpose
        double[][] transpose = transposeMatrix(matrix1);
        System.out.println("\nMatrix Transpose (Matrix 1):");
        displayMatrix(transpose);
        
        // Determinant of 3x3 Matrix
        double det3x3 = determinant3x3(matrix1);
        System.out.println("\nDeterminant of Matrix 1 (3x3): " + det3x3);
        
        // Inversing of 3x3 Matrix
        double[][] inverse3x3 = inverse3x3(matrix1);
        System.out.println("\nInverse of Matrix 1 (3x3):");
        displayMatrix(inverse3x3);
    }
}

import java.util.Scanner;

public class Multiarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dimensions of matrices (rows and columns):");
        System.out.print("Rows of matrix: ");
        int rows = sc.nextInt();
        System.out.print("Columns of matrix: ");
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        System.out.println("Enter elements for matrix1:");
        inputMatrixElements(matrix1, sc);

        System.out.println("Enter elements for matrix2:");
        inputMatrixElements(matrix2, sc);

        System.out.println("\nMatrix1:");
        displayMatrix(matrix1);
        System.out.println("\nMatrix2:");
        displayMatrix(matrix2);

        System.out.println("\nPerforming operations:");
        performMatrixOperations(matrix1, matrix2);
    }

    public static void inputMatrixElements(int[][] matrix, Scanner sc) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Element [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    
    public static void performMatrixOperations(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Matrices must have the same dimensions for addition, subtraction, and division.");
            return;
        }

        
        System.out.println("\nAddition (Matrix1 + Matrix2):");
        int[][] additionResult = matrixAddition(matrix1, matrix2);
        displayMatrix(additionResult);

        
        System.out.println("\nSubtraction (Matrix1 - Matrix2):");
        int[][] subtractionResult = matrixSubtraction(matrix1, matrix2);
        displayMatrix(subtractionResult);

        
        System.out.println("\nDivision (Matrix1 / Matrix2):");
        int[][] divisionResult = matrixDivision(matrix1, matrix2);
        displayMatrix(divisionResult);
    }

    
    public static int[][] matrixAddition(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    
    public static int[][] matrixSubtraction(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    
    public static int[][] matrixDivision(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix2[i][j] != 0) {
                    result[i][j] = matrix1[i][j] / matrix2[i][j];
                } else {
                    
                    result[i][j] = 0; 
                }
            }
        }

        return result;
    }
}

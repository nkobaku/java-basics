package com.arrays.matrix_multiplication;

import java.util.Scanner;

/**
* Java program to calculate product of Two matrices in Java. In order to
* multiply two matrices, column of first matrix must be equal to rows of the second
* matrix.
*
*/
public class MatrixMultiplication{

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of first matrix");
        int rowsOfFirstMatrix = scanner.nextInt();
        int columnsOfFirstMatrix = scanner.nextInt();

        int[][] aMatrix = new int[rowsOfFirstMatrix][columnsOfFirstMatrix];

        System.out.println("Enter the elements of first matrix");
        for (int i = 0; i < rowsOfFirstMatrix; i++) {
            for (int j = 0; j < columnsOfFirstMatrix; j++) {
                aMatrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the number of rows and columns of the second matrix");
        int rowsOfSecondMatrix = scanner.nextInt();
        int columnsOfSecondMatrix = scanner.nextInt();

        // safety net - check order or each matrix, whether eligible for
        // multiplication or not
        while (columnsOfFirstMatrix != rowsOfSecondMatrix) {
            System.out.printf("Matrices with entered orders can't be  multiplied with each other, " 
                  + "columnsOfFirstMatrix [%d] != rowsOfSecondMatrix [%d] %n",
                    columnsOfFirstMatrix, rowsOfSecondMatrix);
            System.out.println("Enter the number of rows and columns of second matrix");
            rowsOfSecondMatrix = scanner.nextInt();
            columnsOfSecondMatrix = scanner.nextInt();
        }

        int[][] bMatrix = new int[rowsOfSecondMatrix][columnsOfSecondMatrix];
        
        System.out.println("Enter numbers of second matrix");
        for (int i = 0; i< rowsOfSecondMatrix; i++) {
            for (int j = 0; j < columnsOfSecondMatrix; j++) {
                bMatrix[i][j] = scanner.nextInt();
            }
        }

        // calculating product of two matrices in Java
        int[][] product = product(aMatrix, bMatrix);
        System.out.println("Product of entered matrices:-");

        for (int i = 0; i < rowsOfFirstMatrix; i++) {
            for (int j = 0; j < columnsOfSecondMatrix; j++) {
                System.out.printf("%d ", product[i][j]);
            }
            System.out.printf("%n");
        }
        scanner.close();
    }

    /**
     * Method to calculate multiplication or product of two matrices.
     *
     * @param matrix1
     * @param matrix2
     * @return product of two matrix
     */
    public static int[][] product(int[][] matrix1, int[][] matrix2) {
        int columnsOfFirstMatrix = matrix1[0].length;
        int rowsOfSecondMatrix = matrix2.length;

        if (columnsOfFirstMatrix != rowsOfSecondMatrix) {
            throw new IllegalArgumentException(String.format("Can't multiply matrices, columns of first matrix"
                    + " %d is not equal to rows of second matrix %d", 
                      columnsOfFirstMatrix, rowsOfSecondMatrix));
        }

        int rowsOfFirstMatrix = matrix1.length;
        int columnsofSecondMatrix = matrix2[0].length;
        int[][] product = new int[rowsOfFirstMatrix][columnsofSecondMatrix];

        for (int i = 0; i < rowsOfFirstMatrix; i++) {
            for (int j = 0; j < columnsofSecondMatrix; j++) {

                int sum = 0;
                for (int k = 0; k < rowsOfSecondMatrix; k++) {
                    sum = sum + matrix1[i][k] * matrix2[k][j];
                }

                product[i][j] = sum;
            }
        }

        return product;
    }

}



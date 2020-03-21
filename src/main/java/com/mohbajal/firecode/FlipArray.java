package com.mohbajal.firecode;
/*
You are given an m x n 2D image matrix where each integer represents a pixel. Flip it in-place along its vertical axis.

Example:
Input image :
              1 0
              1 0

Modified to :
              0 1
              0 1
 */
public class FlipArray {

    public static void flipItVerticalAxis(int[][] matrix) {
        int rows = matrix.length ;
        int columns = matrix[0].length;
        for(int i=0; i<rows;i++) {
            for(int j=0; j< columns-1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][columns-j-1];
                matrix[i][columns-j-1] = temp;
            }
        }
    }

    private static void printArray(int[][] matrix) {
        //Remember this pattern for all 2D array problems
        int rows = matrix.length ;
        int columns = matrix[0].length;
        for(int i=0; i<rows;i++){
            for(int j=0; j< columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {

        int[][] matrix = new int[2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 0;
        matrix[1][0] = 1;
        matrix[1][1] = 0;

        printArray(matrix);
        flipItVerticalAxis(matrix);
        System.out.println();
        printArray(matrix);
    }
}

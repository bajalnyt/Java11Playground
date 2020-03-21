package com.mohbajal;


public class Matrix {
    private static void flipItVerticalAxis(int[][] imgArray) {

        for (int i = 0; i < imgArray.length / 2; i++) {
            for (int j = 0; j < imgArray[i].length; j++) {
                int temp = imgArray[i][j];
                imgArray[i][j] = imgArray[imgArray.length - 1 - i][j];
                imgArray[imgArray.length - 1 -i][j] = temp;
            }
        }
        System.out.println();
        printArray(imgArray);
    }



    private static void printArray(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for(int i=0; i< rows; i ++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] multi = new int[][]{
                {1, 0},
                {1, 0}
        };

        printArray(multi);
        flipItVerticalAxis(multi);
        printArray(multi);
    }
}


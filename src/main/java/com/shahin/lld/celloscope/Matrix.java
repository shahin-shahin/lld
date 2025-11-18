package com.shahin.lld.celloscope;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }


        int leftDiagonalSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            leftDiagonalSum = leftDiagonalSum + matrix[i][i];
        }


        int rightDiagonalSum = 0;

        System.out.println(matrix.length);

        for (int i = 0; i < matrix.length; i++) {
            rightDiagonalSum = rightDiagonalSum + matrix[i][matrix.length - i - 1];
        }

        int x = leftDiagonalSum - rightDiagonalSum;

        if (x > 0) {
            System.out.println(x);
        } else {
            System.out.println(-(x));
        }
        scanner.close();

    }

}

package com.one.familyfirst.spiral;

/**
 * Created by Admin on 1/29/2018.
 */

public class SpiralArray {


    public static void main(String[] args) {

        String nameOne, nameTwo;


        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        int row = 0;
        int col = arr.length;
        int totalCell = col * col;
        int counter = 1;

        col = col - 1;
        
        while (counter <= totalCell) {
            //  Going right

            for (int i = row; i <= col; i++) {

                System.out.print(" " + arr[row][i]);
                counter++;
            }
            // Going downward
            for (int i = row + 1; i <= col; i++) {

                System.out.print(" " + arr[i][col]);
                counter++;
            }
            // Going left
            for (int i = col - 1; i >= row; i--) {
                System.out.print(" " + arr[col][i]);
                counter++;
            }
            // Going upward
            for (int i = col - 1; i >= row+1; i--) {
                System.out.print(" " + arr[i][row]);
                counter++;
            }
            row++;
            col--;
        }

    }


}



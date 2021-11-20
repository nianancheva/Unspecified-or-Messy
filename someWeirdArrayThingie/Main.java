package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        String keyWord = scan.nextLine();

        char[][] arr = new char[2][keyWord.length()];

        char[] chars = {'a', 'b', 'c'};

        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {

                if (c < chars.length) {
                    arr[r][c] = chars[c];
                } else {
                    arr[r][c] = 'X';
                }

            }
        }

        printArr(arr);

    }

    public static void printArr (char[][] arr) {
        for (char[] r : arr) {
            for (char c : r) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

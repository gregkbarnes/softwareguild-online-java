/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.practiceprogramming9;

/**
 *
 * @author GKB
 */
public class SimpleSort {
    public static void main(String[] args) {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 55, 67, 88, 99};
        int[] secondHalf = {1, 4, 8, 11, 15, 18, 100, 21, 44, 54, 79, 89};

        int[] wholeNumbers = new int[24];

        // Combine arrays
        for (int i=0; i<firstHalf.length; ++i) {
            wholeNumbers[i] = firstHalf[i];
        }
        for (int i=0; i<secondHalf.length; ++i) {
            wholeNumbers[i+firstHalf.length] = secondHalf[i];
        }
        
        // Sort arrays
            
        for (int i=0; i<wholeNumbers.length; ++i) {
            for (int j=i+1; j<wholeNumbers.length; ++j) {
                if (wholeNumbers[j] < wholeNumbers[i]) {
                    int temp = wholeNumbers[i];
                    wholeNumbers[i] = wholeNumbers[j];
                    wholeNumbers[j] = temp;                    
                }
            }
        }
        
        for (int i=0; i<wholeNumbers.length; ++i) {
            System.out.print(wholeNumbers[i] + " ");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.assignment.basic_programming_concepts;

/**
 *
 * @author GKB
 */
public class SummativeSums {
    public static void main(String[] args) {
        int[] arr1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] arr2 = { 999, -60, -77, 14, 160, 301 };
        int[] arr3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
        140, 150, 160, 170, 180, 190, 200, -99 };
        
        System.out.println("#1 Array Sum: " + addInts(arr1));
        System.out.println("#2 Array Sum: " + addInts(arr2));
        System.out.println("#3 Array Sum: " + addInts(arr3));
    }
    
    public static int addInts(int[] intArray) {
        int sum = 0;
        
        for (int i = 0; i < intArray.length; ++i) {
            sum += intArray[i];
        }
        
        return sum;
    }
}

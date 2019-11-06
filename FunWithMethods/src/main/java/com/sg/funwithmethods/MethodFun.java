/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.funwithmethods;

import java.util.Scanner;

/**
 *
 * @author GKB
 */
public class MethodFun {
    public static void main(String[] args) {        
        System.out.println(addNums(3));
    }

    public static float addNums(int x) {
        float num = 0;
        Scanner sc = new Scanner(System.in);
        
        for (int i=0;i<x;i++) {
            System.out.println("input number: ");
            String userInput = sc.nextLine();
            num += Float.parseFloat(userInput);
        }
            
        return (num);
    }
}

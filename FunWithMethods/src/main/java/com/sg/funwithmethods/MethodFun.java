/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.funwithmethods;

/**
 *
 * @author GKB
 */
public class MethodFun {
    public static void main(String[] args) {
        int num = 25;
        int i = 16;
        
        silly(5 + 4);
        silly(num);
        silly(i);
        
    }
    
    public static void silly(int i) {
        System.out.println("the value is: " + i);
    }
}

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
        int num = add2Nums(1, 2);
        System.out.println(num);
        
        System.out.println(add2Nums(3, 4));
    }

    public static int add2Nums(int a, int b) {
        return (a+b);
    }
}

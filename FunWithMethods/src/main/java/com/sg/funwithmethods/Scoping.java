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
public class Scoping {
    public static void main(String[] args) {
        int age = 42;
        int i = 0;
        
        for(i=0;i<5;i++) {
            System.out.println(age);
        }
        
        System.out.println(i);
    }
}

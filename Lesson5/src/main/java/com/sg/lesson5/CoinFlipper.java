/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.lesson5;

import java.util.Random;

/**
 *
 * @author GKB
 */
public class CoinFlipper {
    
    public static void main(String[] args){
        Random rGen = new Random();
    
        System.out.println("ready, flip.");
        if (rGen.nextBoolean()) {
            System.out.println("heads");
        } else {
            System.out.println("tails");
        }
        
    
    }
    
}

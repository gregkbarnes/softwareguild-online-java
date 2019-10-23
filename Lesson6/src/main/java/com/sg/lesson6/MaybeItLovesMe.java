/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.lesson6;

import java.util.Random;

/**
 *
 * @author GKB
 * Change your daisy-prediction program from before, to have a RANDOM number 
 * of petals for the daisy (range is usually from 13 - 89 petals).
 * If the last petal ends on "it loves me NOT" print "Awwww, bummer." otherwise 
 * print "Oh, wow! It really LOVES me!"
 */
public class MaybeItLovesMe {
    public static void main(String[] args) {
        Random rGen = new Random();
        boolean lovesMe = true;
        int petals;
        
        do {
            petals = rGen.nextInt(89) + 1;
        } while (petals <= 13);      
        
        System.out.println("Flower has " + petals + " petals.");
        
        while (petals > 0) {
            if (petals % 2 == 0) {
                System.out.println("It LOVES me NOT");
            } else {
                System.out.println("It LOVES me!");
            }
            petals--;
            lovesMe = !lovesMe;
        }
        
        if (lovesMe) {
            System.out.println("Oh, wow! It really LOVES me!");
        } else {
            System.out.println("Bummer dude.");
        }
     }
}

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
 */
public class LazyTeenager {
    public static void main(String[] args) {
        int numScoldings = 0;
        int pctToClean = 0;
        boolean roomClean = false;
        
        Random rGen = new Random();
        
        do {
            System.out.print("Clean YO room nowwwww! ");
            numScoldings++;
            if (pctToClean >= 5*15) {
                System.out.println("That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            }
            System.out.println("(x" + numScoldings + ")");
            pctToClean += 5;
            if (rGen.nextInt(100) < 5) {
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO "
                                    + "EAT MY PEAS.");
                break;
            } 
            
        } while (!roomClean);
    }
    
}

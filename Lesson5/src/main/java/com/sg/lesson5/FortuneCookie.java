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
public class FortuneCookie {
    
    public static void main(String[] args) {
        
        System.out.println("Your Geek Fortune : ");
        
        Random rGen = new Random();
        
        int fortuneNumber = rGen.nextInt(10) + 1;
        
        switch(fortuneNumber) {
            case 1:
                System.out.println("Those aren’t the droids you’re looking for.");
                break;
            case 2:
                System.out.println("Never go in against a Sicilian when death is on the line!");
                break;
            case 3:
                System.out.println("Goonies never say die.");
                break;
            case 4:
                System.out.println("Never argue with the data.");
                break;
            default:
                System.out.println("wooooo");
        }

        
    }
    
    
}

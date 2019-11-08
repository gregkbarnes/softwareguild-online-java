/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.practiceprogramming9;

import java.util.Random;

/**
 *
 * @author GKB
 */
public class HiddenNuts {

    public static void main(String[] args) {

        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");

	for (int i=0; i<hidingSpots.length; ++i) {
            if (hidingSpots[i] != null && hidingSpots[i].equals("Nut")) {
                System.out.println("Found nut in: " + i);
            }
        }
    }
}

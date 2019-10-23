/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.lesson6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author GKB
 * 
 * if the while condition is simply (true), then it will run until a break
 */
public class BewareTheKraken {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rGen = new Random();
        int fish;
        
        System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooOOooOooo.....! *SPLASH*");

        int depthDivedInFt = 0;

        // Turns out the ocean is only so deep, 36200 at the deepest survey,
        // so if we reach the bottom ... we should probably stop.
        while(depthDivedInFt < 36200){
            System.out.println("So far, we've swam " + depthDivedInFt + " feet");
            
            fish = rGen.nextInt(3);
            switch (fish) {
                case 0:
                    System.out.println("Look at that flat-ass flounder");
                    break;
                case 1:
                    System.out.println("Oh shhhhh. It's a barracuda.");
                    break;
                case 2:
                    System.out.println("What kind of fish is that....?");
                    break;
                default:
                    System.out.println("How'd I even get here?");
            }
            
            System.out.println("Do you want to stop (y/n)?");
            if (sc.next().equals("y")) {
                System.out.println("OK, lets go up...");
                break;
            }

            if(depthDivedInFt >= 20000){
                System.out.println("Uhhh, I think I see a Kraken, guys ....");
                System.out.println("TIME TO GO!");
                break;
            }

            // I can swim, really fast! 500ft at a time!
            depthDivedInFt += 1000;
        }
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
    }
}

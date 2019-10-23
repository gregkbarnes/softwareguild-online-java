/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.lesson6;

/**
 *
 * @author GKB
 * 
 * Write a program that picks petals off a daisy (ordinarily 34 petals!) 
 * and prints out "It LOVES me NOT!" or "It LOVES me!" for every other 
 * petal until it runs out of petals. Feel free to print a happy message 
 * at the end too … since the result should ALWAYS be the same.
 * Did you write it in a while, or do/while loop? Why? (answer in a comment)
 * 
 * I used a while loop, as I only want it to run if there are petals on the 
 * flower.
 */
public class LovesMe {
    public static void main(String[] args) {
        int petals = 34;
        
        while (petals > 0) {
            if (petals % 2 == 0) {
                System.out.println("It LOVES me NOT");
            } else {
                System.out.println("It LOVES me!");
            }
            petals--;
        }
        System.out.println("I love me, baby.");
        System.out.println("petals=" + petals);
    }
}

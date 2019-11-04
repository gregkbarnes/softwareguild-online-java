/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.Lesson4Ex6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author GKB
 */
public class GuessMeFinally {
    public static void main(String[] args) {
        int magicNumber;
        int myGuess;
        boolean gameOver = false;
        
        Scanner sc = new Scanner(System.in);
        Random rGen = new Random();
        
        boolean isPositive = rGen.nextBoolean();
        magicNumber = rGen.nextInt(100) + 1;
        if(!isPositive) {
            magicNumber *= -1;
        }

        System.out.println("I've chosen a number between -100 and 100. Betcha can't guess it!");
        while (!gameOver) {
            System.out.println("Your guess: ");        
            myGuess = sc.nextInt();
            
            if (myGuess == magicNumber) {
                System.out.println("Nice. You've got it!");
                gameOver = true;
            } else if (myGuess < magicNumber) {
                System.out.println("too low");
            } else {
                System.out.println("too high");
            }
        }               
    }
}

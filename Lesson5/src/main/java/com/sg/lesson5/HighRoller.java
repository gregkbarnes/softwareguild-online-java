/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.lesson5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author GKB
 */
public class HighRoller {

    public static void main(String[] args) {

        Random diceRoller = new Random();
        Scanner sc = new Scanner(System.in);
        int diceSides = 6;
        
        System.out.println("How many sides on this secksy dice of yours?");
        diceSides = sc.nextInt();

        int rollResult = diceRoller.nextInt(diceSides) + 1;

        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("I rolled a " + rollResult);

        if (rollResult == 1) {
            System.out.println("You rolled a critical failure!");
        } else if (rollResult == diceSides) {
            System.out.println("You rolled a crit.");
        }
    }
}


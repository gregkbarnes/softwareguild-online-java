//Requirements
//In this lab, you will write a program that plays Lucky Sevens. The rules of the game are as follows:
//
//Each round, the program rolls a virtual pair of dice for the user
//If the sum of the 2 dice is equal to 7, the player wins $4; otherwise, the player loses $1
//Your job is to write a program that plays this game, which will also demonstrate the futility of playing Lucky Sevens.
//
//Your program must have the following features:
//This program will be a Java Console Application called LuckySevens .
//The program first asks the user how many dollars they have to bet.
//The program then rolls the dice repeatedly until all the money is gone.
//Hint: use a loop construct to keep playing until the money is gone.
//The program keeps track of how many rolls were taken before the money ran out.
//The program keeps track of the maximum amount of money held by the player.
//The program keeps track of how many rolls were taken at the point when the user held the most money.
//Hint: for steps 4, 5, and 6, declare some variables.

package com.sg.luckysevens;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author GKB
 */
public class LuckySevens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rGen = new Random();
        
        System.out.print("How many dollars do you have? ");
        int balance = sc.nextInt();
        
        int numRolls = 0;
        int maxBalance = balance;
        int maxRolls = 0;
        
        while (balance > 0) {
            int dice1 = rGen.nextInt(6) + 1;
            int dice2 = rGen.nextInt(6) + 1;
            ++numRolls;
            if (dice1 + dice2 == 7) {
                balance += 4;
            } else {
                --balance;
            }
            if (balance > maxBalance) {
                maxBalance = balance;
                maxRolls = numRolls;
            }
        }
        
        System.out.println("You are broke after " + numRolls + " rolls.");
        System.out.println("You should have quit after " + maxRolls + " rolls. You had $" + maxBalance + ".");        
    }
}

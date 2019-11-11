/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author GKB
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isDone = false;
        int ties = 0;
        int playerWins = 0;
        int cpuWins = 0;
        
        while (!isDone) {
            System.out.println("Let's play some Rock, Paper, Scissors!");
            int numRounds = chooseNumRounds();
            if (numRounds >= 1 && numRounds <= 10) {
                for (int i = 0; i < numRounds; ++i) {
                    int userShoot = userChoose();
                    int result = evaluateRound(userShoot);
                    switch (result) {
                        case 0:
                            ++ties;
                            System.out.println("You both chose the same!");
                            break;
                        case 1:
                            ++playerWins;
                            System.out.println("You won this round!");
                            break;
                        case 2:
                            ++cpuWins;
                            System.out.println("You lost this round!");
                            break;
                    }
                }
                printResults(ties, playerWins, cpuWins);
                
                System.out.print("Play again (y/n)?: ");
                String playAgain = sc.nextLine();
                if (playAgain.equals("y")) {
                    // user has decided to play again
                } else if (playAgain.equals("n")) {
                    isDone = true;
                    System.out.println("Thanks for playing!");
                    System.out.println(endGame(0));
                } else {
                    isDone = true;
                    System.out.println(endGame(2));
                }
            } else {
                isDone = true;
                System.out.println(endGame(1));
            }
        }
    }
    
    public static int chooseNumRounds() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many rounds would you like to play (1-10)?: ");
        String numRoundsString = sc.nextLine();
        
        return Integer.parseInt(numRoundsString);
    }
    
    public static String endGame(int errCode) {
        String endGameReason;
        
        System.out.print("Game has ended - ");
        
        switch (errCode) {
            case 0:
                endGameReason = "Case #" + errCode + ": Game ended successfully.";
                break;
            case 1:
                endGameReason = "Case #" + errCode + ": User did not select a number of rounds not between 1-10.";
                break;
            case 2:
            endGameReason = "Case #" + errCode + ": User did not select 'y' or 'n' when asked to play again.";
            break;
            default:
                endGameReason = "Case #?: Unknown end case.";
        }
        
        return endGameReason;
    } 
    
    public static int userChoose() {
        Scanner sc = new Scanner(System.in);
        int userShoot = 0;        
        
        while (userShoot > 3 || userShoot < 1) {
            System.out.print("Choose wisely. Rock (1), Paper (2), or Scissors (3)");
            String rockPaperScissorsString = sc.nextLine();
            userShoot = Integer.parseInt(rockPaperScissorsString);
            if (userShoot > 3 || userShoot < 1) {
                System.out.println("Please select a choice 1-3.");
            }
        }     

        return userShoot;
    }
    
    public static int cpuChoose() {
        Random rGen = new Random();
        
        int cpuShoot = rGen.nextInt(3) + 1;
        
        return cpuShoot;
    }
    
    public static int evaluateRound(int userShoot) {
        /* 
        ***Evalueate Round as follows***
        0=draw
        1=user wins
        2=CPU wins
        
        ***RPS Logic***
        1=Rock
        2=Paper
        3=Scissors
        Rock > Scissors
        Paper > Rock
        Scissors > Paper
        */
        
        int roundResult;
        int cpuShoot = cpuChoose();
        
        if (userShoot == cpuShoot) {
            roundResult = 0;
            System.out.println("This round is a tie!");
        } else {
            roundResult = 0;
            switch(userShoot) {
            case 1:
                if (cpuShoot == 2) {
                    roundResult = 2;
                } else if (cpuShoot == 3) {
                    roundResult = 1;
                }
                break;
            case 2:
                if (cpuShoot == 1) {
                    roundResult = 1;
                } else if (cpuShoot == 3) {
                    roundResult = 2;
                }
                break;    
            case 3:
                if (cpuShoot == 1) {
                    roundResult = 2;
                } else if (cpuShoot == 2) {
                    roundResult = 1;
                }
                break;
            }
        }
        
        return roundResult;
    }
    
    public static void printResults(int ties, int playerWins, int cpuWins) {
        System.out.println("I hope you enjoyed playing :)");
        if (playerWins == cpuWins) {
            System.out.println("You and the CPU tied!");
        } else if (playerWins > cpuWins) {
            System.out.println("You won the game!");
        } else {
            System.out.println("You lost the game this time...");
        }
        System.out.println("Number of ties: " + ties);
        System.out.println("Number of wins: " + playerWins);
        System.out.println("Number of losses: " + cpuWins);
    }
}

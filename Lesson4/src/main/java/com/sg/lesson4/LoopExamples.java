/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.lesson4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author GKB
 */
public class LoopExamples {
    
    public static void main(String[] args){
        
        // Count 1 to 5 with for loop
//        for (int i = 1; i < 6; i++) {
//            System.out.println(i);
//        
//        }

        // Count 5 to 20 by 5s
//        for (int i = 5; i <= 20; i += 5) {
//            System.out.println(i);
//        }

    
        // Count 1 to 5 with while loop
//        int i = 1;
//        while (i <= 5) {
//            System.out.println(i);
//            i++;
//        }

        //Generates random number. if number is less than 8, repeat. while loop
//        Random rGen = new Random();
//        int randomNum = rGen.nextInt(10) + 1;
//        
//        while (randomNum < 8 + 1) {
//            System.out.println(randomNum);
//            randomNum = rGen.nextInt(10) + 1;
//        }
        
        //Generates random number. if number is less than 4, repeat. do while loop
//        Random rGen = new Random();
//        int randomNum = rGen.nextInt(10) + 1;
//        do {
//            System.out.println(randomNum);
//            randomNum = rGen.nextInt(10) + 1;
//        } while (randomNum < 4);

        Scanner sc = new Scanner(System.in);
        int userNumber;
        String userNumberString;
        
        do {
            System.out.println("please enter num 1-20:");
            userNumberString = sc.nextLine();
            userNumber = Integer.parseInt(userNumberString);
        } while (userNumber < 1 || userNumber > 20);
        System.out.println("your number was: " + userNumber);
    }
    
}

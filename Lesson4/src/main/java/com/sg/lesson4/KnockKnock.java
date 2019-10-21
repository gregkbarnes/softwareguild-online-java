/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.lesson4;

import java.util.Scanner;

/**
 *
 * @author GKB
 */
public class KnockKnock {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);

        System.out.print("Knock Knock! Guess who!! ");
        String nameGuess = inputReader.nextLine();

//        if(nameGuess.equals("Marty McFly")){
        if(nameGuess.equalsIgnoreCase("Marty McFly")){
            // this will not ever ==
//        if(nameGuess == "Marty McFly"){
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future."); // Sorry, had to!
        }else{
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
    }
    
}

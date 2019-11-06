/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.practiceprogramming8;

import java.util.Random;

/**
 *
 * @author GKB
 */
public class BarelyControlledChaos {

    public static void main(String[] args) {

        String color = chooseColor(); // call color method here 
        String animal = chooseAnimal(); // call animal method again here 
        String colorAgain = chooseColor(); // call color method again here 
        int weight = chooseNumber(5, 200); // call number method, 
        int distance = chooseNumber(10, 20); // call number method, 
        int number = chooseNumber(10000, 20000); // call number method, 
        int time = chooseNumber(2, 6); // call number method, 
    
        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal 
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over " 
            + number + " " + colorAgain + " poppies for nearly " 
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, " 
            + "let me tell you!");

        
    } 
    
    public static String chooseColor() {
        Random rGen = new Random();
        int randInt = rGen.nextInt(5);
        String color;
        
        switch (randInt) {
            case 0:
                color = "red";
                break;
            case 1:
                color = "blue";
                break;
            case 2:
                color = "yellow";
                break;
            case 3:
                color = "orange";
                break;
            case 4:
                color = "green";
                break;
            default:
                color = "unknown";
                break;
        }
        
        return color;
    }
    
    public static String chooseAnimal() {
        Random rGen = new Random();
        int randInt = rGen.nextInt(5);
        String animal;
        
        switch (randInt) {
            case 0:
                animal = "dog";
                break;
            case 1:
                animal = "cat";
                break;
            case 2:
                animal = "fish";
                break;
            case 3:
                animal = "bird";
                break;
            case 4:
                animal = "mouse";
                break;
            default:
                animal = "unknown";
                break;
        }
        
        return animal;
    }
    
    public static int chooseNumber(int min, int max) {
        Random rGen = new Random();
        int randInt = rGen.nextInt(max - min) + min + 1;
        
        return randInt;
    }
}

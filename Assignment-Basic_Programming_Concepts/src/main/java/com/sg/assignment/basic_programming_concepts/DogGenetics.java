/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.assignment.basic_programming_concepts;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author GKB
 */
public class DogGenetics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rGen = new Random();
        
        System.out.print("What is your dog's name? ");
        String dogName = sc.nextLine();
        
        String allBreeds[] = {"Labrador Retriever", "German Shepard", 
            "Golden Retriever", "Beagle", "English Bulldog", "Yorkshire Terrier", 
            "Boxer", "Poodle", "Rottweiler", "Dachshund", "Shih Tzu"};
        String breedNames[] = new String[5];
        float[] breed = new float[5];
        float sum = 0;
        int[] takenBreeds = new int[5];
        
        System.out.println("Well then, I have this highly reliable report on " + dogName + " prestigious background right here.");
        System.out.println(dogName + " is:");
        
        for (int i = 0; i < breed.length; ++i) {
            breed[i] = rGen.nextInt(100) + 1;
            sum += breed[i];
            
            boolean isTaken = true;
            while (isTaken) {
                isTaken = false;
                int breedIndex = rGen.nextInt(allBreeds.length);
                for (int j = 0; j<takenBreeds.length; ++j) {
                    if (breedIndex == takenBreeds[j]) {
                        isTaken = true;
                    }
                }
                if (!isTaken) {
                    breedNames[i] = allBreeds[breedIndex];
                }
            }
        }
        
        for (int i = 0; i < breed.length; ++i) {
            int percentage = Math.round(breed[i] / sum * 100);
            System.out.println(percentage + "%   " + breedNames[i]);
        }
        
        System.out.println("Wow, that's QUITE the dog!");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.practiceprogramming9;

/**
 *
 * @author GKB
 */

//As many berries as possible
//No more than 3 kinds of apples
//No more than 2 kinds of orange
//Definitely no tomatoes
//More than 12 kinds of fruit isn't recommended

public class FruitSalad {

    public static void main(String[] args) {
        String[] fruit = {  "Kiwi Fruit", "Gala Apple", "Granny Smith Apple", 
                            "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", 
                            "Braeburn Apple", "Blueberry", "Strawberry", 
                            "Navel Orange", "Pink Pearl Apple",  "Raspberry", 
                            "Blood Orange", "Sungold Tomato", "Fuji Apple", 
                            "Blackberry", "Banana", "Pineapple", "Florida Orange", 
                            "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", 
                            "Snozzberry"};
        
        String[] fruitSalad = {"","","","","","","","","","","",""};
        
        int numApples = 0;
        int numOranges = 0;
        int numFruits = 0;
        boolean isAppleOrangeBerry = false;
        
        for (int i=0; i<fruit.length; ++i) {
            if (fruit[i].endsWith("Apple") && numApples < 3 && numFruits < 12) {
                fruitSalad[numFruits] = fruit[i];
                ++numApples;
                ++numFruits;
                isAppleOrangeBerry = true;
            }
            if (fruit[i].endsWith("Orange") && numOranges < 2 && numFruits < 12) {
                fruitSalad[numFruits] = fruit[i];
                ++numOranges;
                ++numFruits;
                isAppleOrangeBerry = true;
            }
            if (fruit[i].endsWith("berry") && numFruits < 12) {
                fruitSalad[numFruits] = fruit[i];
                ++numFruits;
                isAppleOrangeBerry = true;
            }
            
            if (!fruit[i].endsWith("Tomato") && numFruits < 12 && !isAppleOrangeBerry) {
                fruitSalad[numFruits] = fruit[i];
                ++numFruits;
            }
            isAppleOrangeBerry = false;
        }
        
        for (int i=0; i<fruitSalad.length; ++i) {
            System.out.println(fruitSalad[i] + " ");
        }
        System.out.println("There are " + numFruits + " total fruits.");
    }
    
    
}

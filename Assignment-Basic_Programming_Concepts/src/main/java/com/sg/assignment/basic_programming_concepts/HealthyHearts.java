/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.assignment.basic_programming_concepts;

import java.util.Scanner;

/**
 *
 * @author GKB
 */
public class HealthyHearts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        int maxHeartRate;

        System.out.print("What is your age? ");
        age = sc.nextInt();

        maxHeartRate = 220 - age;
        
        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute.");
        System.out.println("Your target HR Zone is " + Math.round(maxHeartRate * .5) + " - " + Math.round(maxHeartRate * .85) + " beats per minute");
    }
}

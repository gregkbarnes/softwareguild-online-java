//    Requirements
//    In this lab, you will write a program that calculates all the factors of a 
//    number entered by the user. The program must print out the original number 
//    along with each of its factors. The program must also tell the user if the 
//    number is a perfect number. A perfect number is a number where all the 
//    factors of the number add up to that number; for example, the first perfect 
//    number is 6 because its factors 1, 2, and 3 add up to 6. Additionally, the 
//    program must tell the user whether or not the number is a prime number. A 
//    prime number is defined as a number that has only itself and 1 as factors; 
//    for example, 3 is a prime number.
//
//    Your program must have the following features:
//    This program must be a Java Console Application called Factorizor.
//    This program must ask the user the number for which he/she wants to factor.
//    The program must print out the original number.
//    The program must print out the total number of factors for the number.
//    The program must print out each factor of the number (not including the number itself).
//    The program must print out whether or not the number is perfect.
//    The program must print out whether or not the number is prime.

package com.sg.factorizor;

import java.util.Scanner;

/**
 *
 * @author GKB
 */
public class Factorizor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What number would you like to factor: ");
        int num = sc.nextInt();
        int numFactors = 0;
        int sumOfFactors = 0;
        
        System.out.println("Your number is: " + num);
        System.out.println("It's factors are: ");
        for (int i=1; i <= num/2; ++i) {
            if (num%i == 0) {
                ++numFactors;
                System.out.print(i + " ");
                sumOfFactors += i;
            }
        }
        System.out.println("");
        
        if (numFactors == 1) {
            System.out.println("This is a prime number (it has no factors other than 1).");
        } else {
            System.out.println("This is NOT a prime number.");
        }
        if (sumOfFactors == num) {
            System.out.println("This is a perfect number (the sum of it's factors add up to the value of itself).");
        } else {
            System.out.println("This is NOT a perfect number.");
        }
    }
    
    
    
}

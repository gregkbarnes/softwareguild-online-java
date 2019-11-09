//    In this lab, you will write an interest calculator program that works as described in this example:
//
//    John has $500 to invest. Sue knows of a mutual fund plan that pays 10% interest annually, compounded quarterly. That is, every three months, the principal is multiplied by 2.5% (the 10% annual rate divided by 4 because it is compounded 4 times per year) and the result is added to the principal.
//
//    More generally, the new amount each quarter is equal to:
//
//    CurrentBalance * (1 + (QuarterlyInterestRate / 100))
//
//    Your assignment is to write a program that will tell John how much money will be in the fund after a specified number of years. Make the program general, that is, it should take as inputs the following:
//
//    Annual interest rate
//    Initial amount of principal
//    The number of years the money is to stay in the fund
//    The output should include the following for each year:
//
//    The year number
//    The principal at the beginning of the year
//    The total amount of interest earned for the year
//    The principal at the end of the year
//    Additional Challenge
//    Change the program so that interest is compounded monthly.
//
//    Change the program so that the user can choose from quarterly, monthly, or daily interest compound periods.

package com.sg.interestcalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author GKB
 */
public class InterestCalculator {
    public static DecimalFormat df = new DecimalFormat("0.00");
    
    public static void main(String[] args) {
        float interestRate = getInput("What is your annual interest rate? ");
        float principal = getInput("What is the initial amount of the principal? ");
        float yearsInFund = getInput("How many years will the money be in the fund? ");
        float compoundType = getInput("What is your compound period - yearly: 0 | quarterly: 1 | monthly: 2 | daily: 3?");

        calculateBalance(interestRate, principal, yearsInFund, compoundType);
    }
    
    public static float getInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextFloat();
    }
    
    public static float calculateBalance(float interestRate, float principal, float yearsInFund, float compoundType) {
        float balance = principal;
        float startBalance;
        int compoundTypeInt = (int) compoundType;
        
        
        switch(compoundTypeInt) {
            case 0:
                for (int i=0; i<yearsInFund; ++i) {
                    System.out.println("Start of year " + (i+1) + " balance = $" + df.format(balance));
                    startBalance = balance;
                    balance *= (interestRate/100+1);
                    System.out.println("Interest earned = $" + df.format(balance - startBalance));
                    System.out.println("End of year " + (i+1) + " balance = $" + df.format(balance));
                }
                break;
            case 1:
                for (int i=0; i<yearsInFund; ++i) {
                    System.out.println("Start of year " + (i+1) + " balance = $" + df.format(balance));
                    startBalance = balance;
                    for (int j=0; j<4; ++j) {
                        balance *= (interestRate/4/100+1);
                    }
                    System.out.println("Interest earned = $" + df.format(balance - startBalance));
                    System.out.println("End of year " + (i+1) + " balance = $" + df.format(balance));
                }
                break;
            case 2:
                for (int i=0; i<yearsInFund; ++i) {
                    System.out.println("Start of year " + (i+1) + " balance = $" + df.format(balance));
                    startBalance = balance;
                    for (int j=0; j<12; ++j) {
                        balance *= (interestRate/12/100+1);
                    }
                    System.out.println("Interest earned = $" + df.format(balance - startBalance));
                    System.out.println("End of year " + (i+1) + " balance = $" + df.format(balance));
                }
                break;
            case 3:
                for (int i=0; i<yearsInFund; ++i) {
                    System.out.println("Start of year " + (i+1) + " balance = $" + df.format(balance));
                    startBalance = balance;
                    for (int j=0; j<365; ++j) {
                        balance *= (interestRate/365/100+1);
                    }
                    System.out.println("Interest earned = $" + df.format(balance - startBalance));
                    System.out.println("End of year " + (i+1) + " balance = $" + df.format(balance));
                }
                break;
            default:
                System.out.println("Compound type not defined.");
        }
        
        return balance;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.Lesson4Ex6;

import java.util.Scanner;

/**
 *
 * @author GKB
 */
public class StayPositive {
    public static void main(String[] args) {
        int userNum;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("What num should I countdown from? ");
        userNum = Integer.parseInt(sc.nextLine());
        System.out.println("Here we go...");
        while (userNum > 0) {
            if(i < 10) {
                System.out.print(userNum + "    ");
                i++;
            } else {
                System.out.print(userNum + "\n ");
                i = 1;
            }
            userNum--;
        }
    }
}

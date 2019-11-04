/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.Lesson4Ex4;

import java.util.Scanner;

/**
 *
 * @author GKB
 */
public class FieldDay {
    
    public static void main(String[] args) {
        String lastName;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What's your last name?");
        lastName = sc.nextLine();
        
        if (lastName.compareTo("Baggins") <= 0) {
            System.out.println("Red Dragons");
        } else if (lastName.compareTo("Dresden") <= 0) {
            System.out.println("Dark Wizards");
        } else if (lastName.compareTo("Howl") <= 0) {
            System.out.println("Moving Castles");
        } else if (lastName.compareTo("Potter") <= 0) {
            System.out.println("Golden Snithces");
        } else if (lastName.compareTo("Vimes") <= 0) {
            System.out.println("Night Guards");
        } else {
            System.out.println("Black Holes");
        }
        
    }
    
}

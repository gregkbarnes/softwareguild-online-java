/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.windowmaster;

import java.util.Scanner;

/**
 *
 * @author GKB
 */
public class WindowMaster {
    public static void main(String[] args){
        // declare vars used in calcuation
        float height;
        float width;
        // declear vars used for user inputs
        String stringHeight;
        String stringWidth;
        
        // declare calculation vars
        float area;
        float perimeter;
        double glass$SqFt = 3.5;
        double trim$SqFt = 2.25;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Height:");
        stringHeight = sc.nextLine();
        System.out.println("Width:");
        stringWidth = sc.nextLine();
        
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        area = height * width;
        perimeter = 2 * (height + width);
        
        double cost = glass$SqFt*area + trim$SqFt*perimeter;
        
        System.out.println("Total cost: $" + cost);
    }
    
}

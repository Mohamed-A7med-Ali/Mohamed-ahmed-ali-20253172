/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication41;

import java.util.Scanner;

/**
 *
 * @author STUDENT
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number:");
        int num=input.nextInt();
        int reverse=0;
        while (num!=0){
            int digit = num %10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        System.out.println("Reverse ="+reverse);
        
    }
    
}

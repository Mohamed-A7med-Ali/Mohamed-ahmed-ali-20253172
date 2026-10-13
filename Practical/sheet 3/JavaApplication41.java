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
public class JavaApplication41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int num;
        int max=0;
        System.out.print("enter a positive number(0 to stop):");
        num =input.nextInt();
        while (num!=0){
            if(num>max){
                max=num;
            }
            System.out.print("enter a positive number(0 to stop):");
            
            num =input.nextInt();
            
        }
        System.out.println("largest number = " + max);
       
    }
    
}

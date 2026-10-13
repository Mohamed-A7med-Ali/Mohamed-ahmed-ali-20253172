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
public class question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("enter n:");
       int n=input.nextInt();
       
       for(int i=1;i<=n;i++){
           
           for(int j=1;j<=i;j++){
               
               System.out.print(j);
           }
           System.out.println();
       }
        // TODO code application logic here
    }
    
}

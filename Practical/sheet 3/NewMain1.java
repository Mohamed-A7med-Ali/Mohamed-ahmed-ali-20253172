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
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter a positive integer:");
        int num= input.nextInt();
        boolean prime =true;
        if(num<=1){
            prime = false;
            
        }else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    prime=false;
                    break;
                }
            }
        }
        if(prime){
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Not a Prime number");
            
        }
    }
    
}

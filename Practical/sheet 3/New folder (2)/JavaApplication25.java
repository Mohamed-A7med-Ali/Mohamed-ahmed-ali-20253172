/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication25;

import java.util.Scanner;
 
public class JavaApplication25{
    public static int getInt(Scanner s,String prompt){
     System.out.print(prompt);
     int num =s.nextInt();
     return num;
 }
    
   
    
    public static void main(String[] args) {
       Scanner S=new Scanner(System.in);
       int age =getInt(S,"Enter your age:");
       System.out.println("Record Age: "+age);
       
        // TODO code application logic here
    }
    
}

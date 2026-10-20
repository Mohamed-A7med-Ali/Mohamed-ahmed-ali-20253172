/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication30;
import java.util.Scanner;
/**
 *
 * @author STUDENT
 */
public class JavaApplication30 {




    public static boolean isValidPassword(String password) {
        // Check minimum length
        if (password.length() < 8) {
            return false;
        }

        int digits = 0;
        boolean hasUppercase = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            // Check that the character is a letter or digit
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

            // Count digits
            if (Character.isDigit(ch)) {
                digits++;
            }

            // Check for uppercase letters
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }
        }

        // Password must have at least 2 digits and 1 uppercase letter
        return digits >= 2 && hasUppercase;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = input.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

   
    }
}

    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2part2;
import java.util.Scanner;
/**
 *Tu Mai
 * UTA ID 1001594173
 * @author maitu
 */
public class Lab2Part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A = 1000, Anot, B, Bnot, C;
        int hundreds, tens, ones;
        String answerMatch = "";
        Scanner input = new Scanner(System.in);
        //  <, >, ==, <=, >=, != 
        System.out.println("Here is a math puzzle for you and I already know the answer! ");
        System.out.println("The answer is :  ** 1089 ** ");
        System.out.println("");
        System.out.println("How many times will you want to test yourself? ");
        int loops = input.nextInt();
        boolean palindrome = true;
        
        
        // for (initialization; test; increment)
        for (int i = 0; i < loops; i++)
        {
            System.out.println("--------------------------------------------------------");
            System.out.print("\nEnter a three digit number : "); 
            A = input.nextInt();        

            // How can we verify that the input number is specifically a 3-digit number?
            // How can you check to see if a number is a palindrome?

            hundreds = A / 100;
            tens = (A % 100)/10;
            ones = A % 10;
            Anot = ones*100 + tens*10 + hundreds;
            
            if (A > Anot)
            {
                B = A - Anot;
            }
            else
            {
                B = Anot - A;
            }
             
            hundreds = B / 100;
            tens = (B % 100)/10;
            ones = B % 10;
            Bnot = ones*100 + tens*10 + hundreds;            
            
            C = B+ Bnot;
        
            System.out.printf("%8s%7s\n","Label","Value");    
            System.out.printf("%8s%7d%-15s\n","A = ",A,"  Display original input value");
            System.out.printf("%8s%7d%-15s\n","Anot = ",Anot, "  Reverse the digits of the input value\n");            
            System.out.printf("%8s%7d%-15s\n","B = ",B,"  Take the absolute value of the difference of A and Anot");
            System.out.printf("%8s%7d%-15s\n","Bnot = ",Bnot, "  Reverse B\n");  
            System.out.printf("%8s%7d%-15s\n","C = ",C, "  Take the sum of B and Bnot"); 
            
            System.out.println("\nDoes the value of sum C "+C+" match my original ** 1089 **?\n");
            if (C == 1089)
            {
                System.out.println("Value of C matches 1089");
            }
            else
            {
                System.out.println("Value of C does not match 1089");
            } 
            A = 1000;  
        }
    }   
}
 
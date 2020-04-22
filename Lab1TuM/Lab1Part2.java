/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1part2;

/**
 *
 * @author maitu
 */
public class Lab1Part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here        System.out.println("");
        int num1 = 72;  // num1 & num2 are variables
        int num2;       // that can hold INTeger values
        System.out.println("Printing variable values");
        System.out.println("Num1 = "+num1);
        num2 = 9;
        System.out.println("Num2 = "+num2);
        System.out.println("Product of num1 & num2 = "+ (num1 * num2) );
        System.out.println("Quotient of num1 & num2 = "+ (num1 / num2) );        
        System.out.println();    // prints a blank line
        System.out.println("Num1 = "+num1+" Num2 = "+num2);
        
        num1 = num1 - (num2 * 3);
        double num3 = num2;   // num3 will hold floating point values
        
        System.out.println("\nNum1 = "+num1
                +" Num2 = "+num2 
                + " Num3 = "+num3);        
        num3 = num3 / 3 + (num1/num3)/2;
        num2 = num2 / 3 + (num1/num2)/2;
        
        System.out.println("New value of num1 [num1 = num1 - (num2 * 3)] is "+num1);
        System.out.println("Value of num3       [num3 = num3 / 3 + (num1/num3)/2] is "+num3 );
        System.out.println("Final value of num2 [num2 = num2 / 3 + (num1/num2)/2] =  "+num2 + "\n");
        System.out.println("Addition sign between num1 and num2 (version 1) "+ num1 + num2 );
        System.out.println("Addition sign between num1 and num2 (version 2) "+ (num1 + num2) ); 
        System.out.println("Addition sign between num1 and num3 (version 3) "+ (num1 + num3) ); 
        System.out.println("Addition sign between num1 and num3 (version 4) "+ num1 + num3 );

    }
    
}

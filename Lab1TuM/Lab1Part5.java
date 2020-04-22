/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1part5;

/**
 *Tu Mai
 *UTA ID 1001594173
 * @author tumai 
 */
import java.util.Scanner;
public class Lab1Part5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int a = 4;
        int b = 9;
        int c = 15;
        int d = 7;
       
        double f = 6.0;
        double g = 11.0; 
        
        int intQuotient, remainder;
        float quotient;
       
      
        
        intQuotient = b / a; 
        remainder = b % a; 
        
        quotient = (float)g / (float)f; 
        
        
        
        System.out.println("intQuotient = b / a = " + intQuotient);
        System.out.println("remainder = b / a = " + remainder);
        System.out.printf("quotient = g / f = " + quotient);
        
        System.out.println("");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value for a");
        a = input.nextInt();
        System.out.println("Please enter the value for b");
        b = input.nextInt() ;
        System.out.println("Please enter the value for f");
        f = input.nextFloat();
        System.out.println("Please enter the value for g");
        g = input.nextFloat();
       
        intQuotient = b / a; 
        remainder = b % a; 
        
        quotient = (float)g / (float)f; 
        
        System.out.println("intQuotient = b / a = " +intQuotient);
        System.out.println("remainder = b % a = " +remainder);
        System.out.println("quotient = g / f = " +quotient);
        
        
        
    }
    
}

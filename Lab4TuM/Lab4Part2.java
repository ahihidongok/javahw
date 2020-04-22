/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4part2;

import java.util.Scanner;

/**
 *Tu Mai
 * @author maitu
 * UTA ID 1001584173
 */
public class Lab4Part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean done = false;
while (!done)
{
System.out.println("\n\nChoose one of the following:\n" +
"1) Convert a decimal value to a binary\n" +
"2) Convert a binary value to a decimal\n" +
"3) Convert a decimal value to a hexadecimal\n" +
"4) Convert a hexadecimal value to a decimal\n" +
"5) Convert a binary value to a hexadecimal\n" +
"6) Convert a hexadecimal value to a binary\n"+
"7) To Quit");
System.out.println("\nEnter a number indicate the method you want to use here or 7 To Quit: ");

Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
if (num == 1)
{System.out.println("Please enter a decimal number ");
    int n = sc.nextInt();
    System.out.println("Result:");
decToBinary( n);     
}
else if (num == 2)
{System.out.println("Please enter a binary number ");
    int n = sc.nextInt();
    System.out.println("Result:");
 binaryToDecimal(n);   
}
else if (num == 3)
{System.out.println("Please enter a decimal number ");
    int n = sc.nextInt();
    System.out.println("Result:");
    decToHexa( n); 
}
else if (num == 4)
{   System.out.println("Please enter a hexadecimal number ");
    String hexVal = sc.next();
    System.out.println("Result:");
    hexadecimalToDecimal(hexVal);
}
else if (num == 5)
{
  System.out.println("Please enter a binary number ");
  int binary = sc.nextInt();
  int dec ;
    System.out.println("Decimal:");
 dec =  binaryToDecimal(binary);
    System.out.println("Result: Hexadecimal:");
 decToHexa( dec); 
  
}
else if (num == 6)
{System.out.println("Please enter a hexadecimal number ");
 String hex = sc.next();
 int dec; 
    System.out.println("Decimal:");
 dec = hexadecimalToDecimal(hex);
 System.out.println("Result:");
 decToBinary(dec); 
}
else if (num == 7)
{
    done = true;
}
    }

    }      
    
 public static void decToBinary(int n) 
    { 
        
        int[] binaryNum = new int[1000];
        int i = 0; 
        while (n > 0)  
        { 
            binaryNum[i] = n % 2; 
            n = n / 2; 
            i++; 
        } 
        for (int j = i - 1; j >= 0; j--) 
            System.out.print(binaryNum[j]); 
    } 
 
public static int binaryToDecimal(int n) 
{ 
    int num = n; 
    int dec_value = 0; 
      
    // Initializing base  
    // value to 1, i.e 2^0 
    int base = 1; 
      
    int temp = num; 
    while (temp > 0) 
    { 
        int last_digit = temp % 10; 
        temp = temp / 10; 
          
        dec_value += last_digit * base; 
          
        base = base * 2; 
        
    } 
    System.out.println(dec_value);  
    return dec_value; 
}  
public static void decToHexa(int n) 
    {  char values[] =  new char[]  {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
        int[] decNum = new int[100];
        int i = 0; 
        while (n > 0)  
        { 
            decNum[i] = n % 16; 
            n = n / 16; 
            i++; 
        } 
        for (int j = i - 1; j >= 0; j--) 
            System.out.print(values[decNum[j]]);  
        System.out.println("");
    } 
public static int hexadecimalToDecimal(String hexVal) 
    {   
        int len = hexVal.length(); 
        int base = 1; 
        int dec_val = 0; 

        for (int i=len-1; i>=0; i--) 
        {    
            if (hexVal.charAt(i) >= '0' && hexVal.charAt(i) <= '9') 
            { 
                dec_val += (hexVal.charAt(i) - 48)*base; 
                                 
                base = base * 16; 
            } 
        
            else if (hexVal.charAt(i) >= 'A' && hexVal.charAt(i) <= 'F') 
            { 
                dec_val += (hexVal.charAt(i) - 55)*base; 
                  base = base*16; 
            } 
        } 
        System.out.println(dec_val);
        return dec_val; 
    } 



    
}

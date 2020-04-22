/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1part4;

import java.util.Scanner;

/**
 *
 * @author maitu
 */
public class Lab1Part4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Correctly find the surface area of the rectangular prism
        Scanner myscanner = new Scanner(System.in);

        
        int h = 3;
        int l = 4;
        int w = 5;
        
        System.out.print("Please enter a number ");
        	h = myscanner.nextInt();
        	System.out.print("Please enter another number ");
        	w = myscanner.nextInt();     
        	System.out.print("Please enter a third number ");
        	l = myscanner.nextInt();     

        System.out.print("Dimensions of the rectangular prism are ");
        System.out.println(h + " by " + w + " by " + l );
        
        int face1 = h * w;
        int face2 = l * h;
        int face3 = w * l;
        
        int surfaceArea;
        
        System.out.print("The areas of the three different sized faces of the prism are ");
        System.out.println(face1 + " and " + face2 + " and " + face3);
        
        surfaceArea = 2 * face1 + 2 * face2 + 2 * face3;
        System.out.print("The equation for the surface area of the rectangular prism is ");
        System.out.println("2 * "+face1+" + 2 * "+face2+" + 2 * "+face3);
        System.out.println("The surface area of the rectangular prism is "+surfaceArea);}

}
    


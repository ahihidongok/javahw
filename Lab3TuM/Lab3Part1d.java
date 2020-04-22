/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3part1d;
import java.io.File;
import java.io.FileNotFoundException;
//import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *Dr. Carter Tiernan
 * UTA ID: 1001594173
 * @author maitu
 */
public class Lab3Part1d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
     String dataFile = "SciFiDataBMTClean.txt";
     File inputData = new File (dataFile);
     
     Scanner inFile;
     
     try
        {
            inFile = new Scanner(inputData);
        }
    catch (FileNotFoundException fnfe)
        {
            inFile = new Scanner(System.in);
            System.out.println("\nInput file \""+dataFile+"\" was not found");
        }
     Scanner inData = new Scanner(System.in);
     String inString = "";
     String Ctype, Tittle, Series, MTypes, BkCovers = "";
     int SNum,MYear1,MYear2, MYear3 = 0;
     double BkPrices = 00;
     int Counter = 1;
     String[] TittlesA = new String[70];
     int[] SNumA = new int[70];
     String[] SeriesA = new String[70];
     double[] BkPricesA = new double[70]; 
     
    
 
 
        System.out.printf("\n%2s %10s %-39s %15s %-43s %8s %8s %8s %8s %8s %8s %8s %8s \n","  ","Content Type","Tittle","SNumber", "Series Name","MType1","MYear1","BCover", "BkPrice","MType2","MYear2","MType3","MYear3");
        System.out.println("_________________________________________________________________________________________________________________________________________________________________________________________________");
 do
 { System.out.printf("%2d",Counter);
   inString = inFile.nextLine();
   inData = new Scanner(inString);
        
        inData.useDelimiter(" ");
        Ctype = inData.next();
        System.out.printf(" %-10s",Ctype);
        inData.useDelimiter("-*[0-9]");
        Tittle = inData.next();
        System.out.printf(" %-39s",Tittle);
        inData.useDelimiter(" ");
        SNum = inData.nextInt();
        System.out.printf(" %15s",SNum);
        inData.useDelimiter(":");
        Series = inData.next();
        System.out.printf(" %-45s", Series);
        inData.useDelimiter(" ");
        inData.next();
        while(inData.hasNext())
        {
            String Type= "";
            Type = inData.next();
            
            
         switch(Type)
         {
  

             case "Book":
             {
              System.out.printf("%8s",Type);
              MYear1 = inData.nextInt();
              BkCovers = inData.next();
              BkPrices = inData.nextDouble();
              System.out.printf("%8s %8s %8s",MYear1,BkCovers,BkPrices);
              if (inData.hasNext()) 
              {
                    inData.useDelimiter(" ");
                    System.out.printf("%8s %8s", inData.next(), inData.next());
              }
                if (inData.hasNext()) 
                {
                    inData.useDelimiter(" ");
                    System.out.printf("%8s %8s", inData.next(), inData.next());
                }
                break;
             }
             case "Movie":
             {

            
              MYear2 = inData.nextInt();
              BkPrices = -1;
              System.out.printf(" %5s %8s %8s %8s %8s %8s","", "", "", BkPrices, Type, MYear2);
              if (inData.hasNext()) {
                    inData.useDelimiter(" ");
                    System.out.printf("%8s %8s", inData.next(), inData.next());
              }
              break;   
             }
             case "TV":
             {
            
              MYear3 = inData.nextInt();
              BkPrices = -1;
              System.out.printf("%5s %8s %8s %8s %8s %8s","", "", "", BkPrices, Type, MYear3);
              break;  
             }
        
         }
        
        TittlesA[Counter-1] = Tittle; 
        SNumA[Counter-1] = SNum;
        SeriesA[Counter-1] = Series;
        BkPricesA[Counter-1] = BkPrices;
       
        }
        Counter++;
        System.out.println("\n");

        //printYearTittle(TittlesA, SNumA,SeriesA,BkPricesA, Counter);
        
 }
 while (inFile.hasNext());
        
        printYearTittle(TittlesA, SNumA,SeriesA,BkPricesA, Counter);
      
 
    }
public static void printYearTittle(String[] TittlesA,int[] SNumA,String[] SeriesA, double[] BkPricesA, int Counter )
{
   for (int cntr = 0; cntr < Counter-1; cntr++)
   {
       System.out.println("Tittle"+TittlesA[cntr]+ ": Series number  is "+SNumA[cntr]+" , Series name is " + SeriesA[cntr]+" and Price is "+ BkPricesA[cntr]);
   }
}
    
}

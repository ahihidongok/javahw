/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3part3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author maitu
 */
public class Lab3Part3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inData = null;
        char CType;
        String Title = "", Series ="";
        int SNum;
        String Media1 = "" , Media2 = "" , Media3 = "";
        int MYear1 = 0 , MYear2 = 0, MYear3 = 0 ;
        char BkCov = ' ';
        double BkPr = 0.0;
        boolean dataValid = true;        
        String Book = "", Movie = "", TV = "";        
        String tempD;
        Scanner input = new Scanner(System.in);
        int counter = 1;
        
        String[] Titles = new String[80];
        int[] SNums = new int[80];
        String [] SNames = new String[80];
        double[] Prices = new double[80];
       
        
         
        
        boolean eva = false;
        System.out.println("Enter file name: ");

        while(!eva)
        {
            Scanner sc = new Scanner(System.in);
            String dataFile = sc.next();
            File inputData = new File (dataFile);

            try
            {
                inData = new Scanner(inputData);
                eva = true;
            }
            catch (FileNotFoundException fnfe)
            {
                inData = new Scanner(System.in);
                System.out.println("Input File " + dataFile + " was not found. Please Enter Correct file name: " );
            }  
        }


                
        
        
        String inString ="";
        
        
        System.out.printf("\n%10s %30s %20s %15s %40s %20s %20s %20s %20s %20s %20s %20s\n", "Content Type","Title","Series Number","Series Name","Media Type (1)","Media Year (1)",
                                        "Book Cover","Price",
                                "Media Type (2)","Media Year (2)","Media Type (3)","Meadia Year(3)");
        System.out.println("_____________________________________________");
        
        
        do
        {           
            dataValid = true;
            inString = inData.nextLine();
            Scanner data = new Scanner(inString);
            tempD = data.next();
            CType = tempD.charAt(0);
            if ( CType != 'F' && CType != 'S' && CType != 'E')
            {
                dataValid = false;
            }
                       
            data.useDelimiter("[0-9]");
            Title = data.next();
            data.reset();
            SNum = data.nextInt();
            
            data.useDelimiter(":");
            Series = data.next();
            data.reset();   
            data.next(); //remove the colon :
            
            
            //data.useDelimiter("[0-9]");
            Media1 = data.next();   

            if (!Media1.equals("Book") && !Media1.equals("Movie") && !Media1.equals("TV") )
            {
                dataValid = false;
            }
            data.reset();       
            try
            {
                MYear1 = Integer.parseInt(data.next());  
                if( Media1.equals("Book") && 1439 > MYear1 || MYear1 > 2020 )
                {
                    dataValid = false;
                }
               
            }
            catch(NumberFormatException ime)
            {
                dataValid = false;
            }
                     
      
       
        
            if(Media1.equals("Book"))
            {
               tempD = data.next();
               BkCov = tempD.charAt(0);
               BkPr = data.nextDouble(); 
               if(BkCov != 'E' && BkCov != 'H' && BkCov != 'P' && BkCov != 'S' )
               {
                   dataValid = false;
               }
               if(BkPr < 0)
                {
                    System.out.println("Book price is less than 0.");
                    BkPr = 0;
                }   
            }
            else
            {
               BkCov = ' ';
               BkPr = -1;
            }
       
            
            try
            {
                
                Media2 = data.next(); 
                
            if (!Media2.equals("Movie") && !Media2.equals("TV") )
                {
                dataValid = false;
                }
                data.reset();           
                try
                {    
                    MYear2 = Integer.parseInt(data.next());             
                    if( Media1.equals("Movie") && 1888 > MYear2 || MYear2 > 2020 )
                    {
                        dataValid = false;
                    }
                 }
                catch(NumberFormatException ime)
                {
                    dataValid = false;
                }
            }   
            catch (NoSuchElementException nsee)
            {
                Media2 = " ";
                MYear2 = 0;
            }
            
            
            
            
            try
            {
                //data.useDelimiter("[0-9]");
                Media3 = data.next();  
                    if ( !Media3.equals("TV") )
                        {
                            dataValid = false;
                        }
                data.reset(); 
                try
                {
                    MYear2 = Integer.parseInt(data.next());  
                
                    if( Media1.equals("TV") && 1927 > MYear3 || MYear3 > 2022 )
                        {
                            dataValid = false;
                        }
                }
                catch(NumberFormatException ime)
                {
                    dataValid = false;
                }
            }
            catch (NoSuchElementException nsee)
            {
                Media3 = " ";
                MYear3 = 0;
            }
            
            Titles[counter-1]= Title;
            SNums [counter-1]=SNum;
            SNames[counter-1]=Series;
            Prices[counter-1]=BkPr;
            counter++;
            printData(CType, Title, SNum, Series, Media1, MYear1, BkCov, BkPr, Media2, MYear2, Media3, MYear3, dataValid);
            System.out.printf("\n");
            
        }
        while ( inData.hasNext());
        
        for (int i=0; i < counter-1; i++)
             {
                 System.out.println("Tittles: "+Titles[i]+"  Series numbers: "+SNums[i]+"  Series names: "+SNames[i]+"   Prices: "+Prices[i]);                
             }   
        orderingData(Titles,SNums,SNames,Prices);
    }
    
    public static void printData(char CType, String Title, int SNum, String Series, String Media1, int MYear1, char BkCov, double BkPr, String Media2, int MYear2, String Media3, int MYear3, boolean dataValid)
    {
        if(dataValid)
        {
            System.out.printf("%10s",CType);
            System.out.printf("%40s", Title);
            System.out.printf("%5s",SNum);
            System.out.printf("%45s",Series);
            System.out.printf("%20s",Media1);
            System.out.printf("%20s",(MYear1 > 0 ? MYear1 : " "));
            System.out.printf("%20s", BkCov);
            System.out.printf("%20s", (BkPr));
            System.out.printf("%20s",Media2);
            System.out.printf("%20s",(MYear2 > 0 ? MYear2 : " "));
            System.out.printf("%20s",Media3);
            System.out.printf("%20s",(MYear3 > 0 ? MYear3 : " "));
        }
        else
        {
            System.out.printf("Error was found.");
        }
        
    }
    public static void orderingData(String[] Tittle, int[] SNum, String[] SNames, double[]prices )
{
for ( int i=0;i<80;i++)
{
    int CURseries = i+1;
    for (int j = 0; j<80;j++)
    {
      if (SNum[j] == CURseries)
    {
        int foundindex = j+1;
        System.out.println("Series number " +CURseries+" found at index = "+foundindex+" Tittle is "+Tittle[j]+" seires name is "+ SNames[j] +" costs "+prices[j]);  
    }
}
}
}
}
    
    

    
    


    
    


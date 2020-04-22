/****
 * 
 *  Intro to Programming CSE 1310
 * University of Texas at Arlington
 * CSE 1310 - 005 Lab 2 Part 1 
 * 
 */
package lab2part1;
import java.util.Scanner;
/**
 *Tu Mai 
 * UTA ID 1001594173
 * @author maitu
 */
public class Lab2Part1 


{
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic 
       String title1 = "Star Trek";
        String title2 = "Dr. Who";
        String title3 = "The Fellowship of the Ring";
        String title4 = "Firefly";
        int book1Year = 1967;
        int movie1Year = 1979;
        int tv1Year = 1966;
        int book2Year = 1964;
        int movie2Year = 1966;
        int tv2Year = 1963; 
        int book3Year = 1955;
        int movie3Year = 2001;
        int tv3Year = 2021;
        int book4Year = 2018;
        int movie4Year = 2005;
        int tv4Year = 2002;    
        Scanner input =new Scanner(System.in);
        int earlyYear = 0;
        String tempIn = "";
        char yearType = ' ';
        int select = 0;
        boolean done = false;
        char cont = ' ';
        
        System.out.println("The following information is available in this program: ");
        System.out.printf("%29s%7s%7s%7s\n","Title","Book","Movie","TV");    
        System.out.printf("%2d%27s%7s%7s%7s\n",1,title1,book1Year,movie1Year,tv1Year);
        System.out.printf("%2d%27s%7s%7s%7s\n",2,title2,book2Year,movie2Year,tv2Year);    
        System.out.printf("%2d%27s%7s%7s%7s\n",3,title3,book3Year,movie3Year,tv3Year);
        System.out.printf("%2d%27s%7s%7s%7s\n",4,title4,book4Year,movie4Year,tv4Year); 

        System.out.println("Now you will answer some questions about the data\n"
                + " and the program will make some conclusions.\n");
        
   
        
        
        while (done == false)
        {
        select = 0; 
        System.out.print("Pick one of the years shown:  ");
        earlyYear = input.nextInt();
        System.out.print("Is that year for a book (B), a movie (M), or TV (T)?  Enter the letter: ");
        tempIn = input.next();
        yearType = tempIn.charAt(0);
        
        
        
        System.out.println("You have entered "+earlyYear+" and "+yearType);
         
        if (yearType == 'B')
        {
            if (earlyYear == book1Year)
            {
                select = 1;
            }
            else if (earlyYear == book2Year)
            {
                select = 2;
            }
            else if (earlyYear == book3Year)
            {
                select = 3;
            }   
            else if (earlyYear == book4Year)
            {
                select = 4;
            }            
        }
        else if (yearType == 'M')
        {
             if (earlyYear == movie1Year)
                {
                    select = 1;
                }
                if (earlyYear == movie2Year)
                {
                    select = 2; 
                }
                if (earlyYear == movie3Year)
                {
                    select = 3;
                }
                if (earlyYear == movie4Year)
                {
                    select = 4;
                }
        }
        else if (yearType == 'T')
        {
             if (earlyYear == tv1Year)
                {
                    select = 1;
                }
                if (earlyYear == tv2Year)
                {
                    select = 2;
                }
                if (earlyYear == tv3Year)
                {
                    select = 3;
                }
                if (earlyYear == tv4Year)
                {
                    select = 4;
                }

        }
        // What if user enters something other than B, M, or T ?
        
        if ((select == 1) && (yearType == 'B') || ( yearType == 'b'))
        {
            System.out.println("You selected the book for "+title1+" published in "+book1Year);
        }
        else if ((select == 2) && (yearType == 'B') || ( yearType == 'b'))
        {
            System.out.println("You selected the book for "+title2+" published in "+book2Year);
        }    
        else if ((select == 3) && (yearType == 'B')|| ( yearType == 'b'))
        {
            System.out.println("You selected the book for "+title3+" published in "+book3Year);
        }    
        else if ((select == 4) && (yearType == 'B')|| ( yearType == 'b'))
        {
            System.out.println("You selected the book for "+title4+" published in "+book4Year);
        }    
         
        
        else if ((select == 1) && (yearType == 'M')|| ( yearType == 'm'))
        {
            System.out.println("You selected the movie for "+title1+" premiering in "+movie1Year);
        }    
        else if ((select == 2) && (yearType == 'M')|| ( yearType == 'm'))
        {
            System.out.println("You selected the movie for "+title2+" premiering in "+movie2Year);
        } 
        else if ((select == 3) && (yearType == 'M')|| ( yearType == 'm'))
        {
            System.out.println("You selected the movie for "+title3+" premiering in "+movie3Year);
        } 
        else if ((select == 4) && (yearType == 'M')|| ( yearType == 'm'))
        {
            System.out.println("You selected the movie for "+title4+" premiering in "+movie4Year);
        } 
        
        
        else if ((select == 1) && (yearType == 'T')|| ( yearType == 't') )
        {
            System.out.println("You selected the TV show for "+title1+" airing in "+tv1Year);
        }  
        else if ((select == 2) && (yearType == 'T') || ( yearType == 't'))
        {
            System.out.println("You selected the TV show for "+title2+" airing in "+tv2Year);
        }  
        else if ((select == 3) && (yearType == 'T')|| ( yearType == 't'))
        {
            System.out.println("You selected the TV show for "+title3+" airing in "+tv3Year);
        }  
        else if ((select == 4) && (yearType == 'T')|| ( yearType == 't'))
        {
            System.out.println("You selected the TV show for "+title4+" airing in "+tv4Year);
        }  
       
        else
        {
            System.out.println("You entered the wrong year or letter");
            
        }
       
        System.out.println("Do you want to quit? Enter Y to quit");
        tempIn = input.next();
        cont = tempIn.charAt(0);
        if ((cont == 'Y') || (cont == 'y'))
        {
            done = true; 
        }
        else 
        {
            done = false; 
        }
        
        
    }
         
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extracredit;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author maitu
 */
public class ExtraCredit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int constA = 9;
        int[] vectorA = {100, 101, 102};
        
        int[][] matrixA = {{ 1,  2,  3},
                           { 4,  5,  6},
                           { 7,  8,  9},
                           {10, 11, 12}};

        
        int[][] matrixB = {{21, 22, 23},
                           {24, 25, 26},
                           {27, 28, 29},
                           {30, 31, 32}};  
        int[][] matrixR = new int[4][3];
        
       
        
        int[][] matrixA2 = {{ 1,  2,  3},
                           { 4,  5,  6}};
                           

        
        int[][] matrixB2 = {{21, 22},
                           {24, 25},
                           {27, 28}};  
        int[][] matrixR2 = new int[2][2];
       
        mutiplyMat(matrixA,matrixB,matrixR);
        mutiplyMat(matrixA2,matrixB2,matrixR2);
        System.out.println("Examples with arrays\n");
        // add a value to every element in an array
        System.out.println("vectorA original:");
        print1DarrayColumn(vectorA);
        
        for (int i = 0; i < vectorA.length; i++)
        {
            vectorA[i] = vectorA[i] + constA;
        }
        System.out.println("\nvectorA after adding "+constA+" to each element:");
        print1DarrayColumn(vectorA);
        
        //System.out.println("\nmatrixA element [0][0] = "+matrixA[0][0]);
        
        System.out.println("\nmatrixA original:");
        print2DarrayColumn(matrixA);
        /*
         for (int i = 0; i < matrixA.length; i++)
        {
            matrixA[i] = matrixA[i] + constA;
        } 
*/
//        for (int i = 0, j= 0; (i < matrixA.length) && (j < matrixA[i].length); i++, j++)
        for (int i = 0; (i < matrixA.length); i++)
            for (int j = 0; j < matrixA[i].length; j++)
            {
                matrixA[i][j] = matrixA[i][j] + constA;
            }   
        
        System.out.println("\nmatrixA after adding "+constA+" to each element:");        
        print2DarrayColumn(matrixA);    
        
        for (int i = 0; i < matrixA.length; i++)
            for (int j = 0; j < matrixA[i].length; j++)
            {
                matrixA[i][j] = matrixA[i][j] + vectorA[j];
            }        
        System.out.println("\nvectorA current:");
        print1DarrayRow(vectorA);
        System.out.println("\nmatrixA after adding vectorA to each row:");        
        print2DarrayColumn(matrixA);   
        System.out.println("\nmatrixB original:");
        print2DarrayColumn(matrixB);        
        
        for (int i = 0; i < matrixA.length; i++)
            for (int j = 0; j < matrixA[i].length; j++)
            {
                matrixA[i][j] = matrixA[i][j] + matrixB[i][j];
            }        
        System.out.println("\nmatrixA after adding matrixB:");        
        print2DarrayColumn(matrixA);     
        
        
        
        
        System.out.println("\n\nSwitching to ArrayLists");
        int constZ = 9;
        ArrayList<Integer> vectorZ = new ArrayList<Integer>(Arrays.asList(10, 11, 12));
        System.out.println("\n\nvectorZ original:");
        print1DarrayListRow(vectorZ);   
        
        for (int i = 0; i < vectorZ.size(); i++)
        {
            vectorZ.set(i,(vectorZ.get(i)+constZ));
           // vectorA[i] = vectorA[i] + constA;
        }
        System.out.println("\nvectorZ after adding "+constZ+" to each element:");
        print1DarrayListRow(vectorZ);  
        System.out.println("");

        System.out.println("\nmatrixZ original:");
        ArrayList<ArrayList<Integer>> matrixZ = new ArrayList<ArrayList<Integer>>();

        matrixZ.add(new ArrayList<Integer>(Arrays.asList(2, 4, 6)));
        matrixZ.add(new ArrayList<Integer>(Arrays.asList(8, 10, 12)));
        matrixZ.add(new ArrayList<Integer>(Arrays.asList(14, 16, 18)));
        matrixZ.add(new ArrayList<Integer>(Arrays.asList(20, 22, 24))); 
        print2DarrayListColumn(matrixZ); 
        
        //ArrayList<Integer> tempVectorZ = new ArrayList<Integer>();  // attempt 1
        for (int i = 0; i < matrixZ.size(); i++)
        {
            
            for (int j = 0; j < matrixZ.get(i).size(); j++)
            {
                // in the matrix, get the row(i), then set element in column j in that row by
                // getting the current element at row i, column j and adding constZ to it
                matrixZ.get(i).set(j, matrixZ.get(i).get(j) + constZ);
                
                //tempVectorZ.set(j, matrixZ.get(i).get(j) + constZ);  // attempt 1
            }  
            //matrixZ.set(i,tempVectorZ);  // attempt 1
        }
        System.out.println("\nmatrixZ after adding "+constZ+" to each element:");        
        print2DarrayListColumn(matrixZ);           
        System.out.println("\n\nvectorZ current:");
        print1DarrayListRow(vectorZ);          
        for (int i = 0; i < matrixZ.size(); i++)
        {
            for (int j = 0; j < matrixZ.get(i).size(); j++)
            {
                // in the matrix, get the row(i), then set element in column j in that row by
                // getting the current element at row i, column j and adding vector element j to it
                matrixZ.get(i).set(j, matrixZ.get(i).get(j) + vectorZ.get(j));
            }  
        }
        System.out.println("\nmatrixZ after adding vectorZ to each row::");        
        print2DarrayListColumn(matrixZ); 

        System.out.println("\nmatrixY original:");
        ArrayList<ArrayList<Integer>> matrixY = new ArrayList<ArrayList<Integer>>();
        matrixY.add(new ArrayList<Integer>(Arrays.asList(302, 304, 306)));
        matrixY.add(new ArrayList<Integer>(Arrays.asList(308, 310, 312)));
        matrixY.add(new ArrayList<Integer>(Arrays.asList(314, 316, 318)));
        matrixY.add(new ArrayList<Integer>(Arrays.asList(320, 322, 324))); 
        print2DarrayListColumn(matrixY);    
        
        ArrayList<ArrayList<Integer>> matrixX = new ArrayList<ArrayList<Integer>>(matrixZ);
        for (int i = 0; i < matrixZ.size(); i++)
        {
            for (int j = 0; j < matrixZ.get(i).size(); j++)
            {
                matrixX.get(i).set(j, matrixZ.get(i).get(j) + matrixY.get(i).get(j));
            }  
        }        
        System.out.println("\nmatrixX is matrixZ after adding matrixY:");        
        print2DarrayListColumn(matrixX);     
        
        matrixX.add(new ArrayList<Integer>(Arrays.asList(500, 502, 504)));
        System.out.println("\nmatrixX after adding one more row:");        
        print2DarrayListColumn(matrixX);        
        
    }
    public static void print1DarrayColumn(int[] vectorA)   
    {
        for (int i = 0; i < vectorA.length; i++)
        {
            System.out.println("["+i+"] = "+vectorA[i]);
        }        
        
    }
    public static void print2DarrayColumn(int[][] matrix)
    {
        System.out.print("Column");  // Print title row
        for (int j = 0; j < matrix[0].length; j++)
        {
            System.out.print("\t["+j+"]");  // Print title row
        }         
        System.out.println("");
        for (int i = 0; i < matrix.length; i++)
        {
            System.out.print("Row["+i+"]");  // Label beginning of each row
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print("\t"+matrix[i][j]);
            }    
            System.out.println("");
        }        
    }
    public static void print1DarrayRow(int[] vectorA)   
    {
        System.out.print("\t[");
        for (int i = 0; i < vectorA.length; i++)
        {
            System.out.print(vectorA[i]+
                    ( ((i+1) == vectorA.length) ?  ""  :  "\t" ));
            
        }      
        System.out.print("]\n");
        
    }   
    public static void print1DarrayListRow(ArrayList<Integer> vectorZ)   
    {
        System.out.print("\t[");
        for (int i = 0; i < vectorZ.size(); i++)
        {
            System.out.print(vectorZ.get(i)+
                    ( ((i+1) == vectorZ.size()) ?  ""  :  "\t" ));
            
        }      
        System.out.print("]\n");
        
    } 

    public static void print2DarrayListColumn(ArrayList<ArrayList<Integer>> matrix)
    {
        System.out.print("Column");  // Print title row
        for (int j = 0; j < matrix.get(0).size(); j++)
        {
            System.out.print("\t["+j+"]");  // Print title row
        }         
        System.out.println("");
        for (int i = 0; i < matrix.size(); i++)
        {
            System.out.print("Row["+i+"]");  // Label beginning of each row
            for (int j = 0; j < matrix.get(i).size(); j++)
            {
                System.out.print("\t"+matrix.get(i).get(j));
            }    
            System.out.println("");
        }  
     
        
    }  
    public static boolean mutiplyMat (int[][] A, int[][]B, int[][]R)
    {   
        boolean ret = false;
        int result;
        int ARows = A.length;
        int ACols = A[0].length;
        int BRows = B.length;
        int BCols = B[0].length;
        int RRows = R.length;
        int RCols = R[0].length;
        if ((ARows == BCols)&&
            (ACols == BRows)&&
            (RRows == ARows)&&
            (RCols == BCols))
        {
           
            
                    
                for (int k=0;k<ARows;k++)
                {
                    
                  for (int h=0;h<BCols;h++)  
                  {
                      result = 0;
                    for (int l=0;l<BRows;l++)
                    {  
                    result =  result + A[k][l]*B[l][h];
                
                    }
                 //System.out.println(result);
                 R[k][h] = result;   
                 
                }
          
                }
                for (int i=0;i<RRows;i++)
                {
                    for (int j=0;j<RCols;j++)
                    {
                        System.out.print(R[i][j]+" ");
                        
                    }
                    System.out.println("");
                }
                ret = true;
               }
           
       
        else
        {
            System.out.println("Matrix contains wrong size");
        }
    return ret; 
    }
   
    
    
}

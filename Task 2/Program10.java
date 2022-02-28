// find transpose of a given matrix
import java.util.*;

public class Program10{
     public static void main(String []args)
     {
          Scanner sc=new Scanner(System.in);
         
         int m,n;                 
         
         System.out.println("Enter the number of rows: ");
         m=sc.nextInt();  
         
         System.out.println("Enter the number of column: ");
         n=sc.nextInt(); 
         
         int arr[][]=new int[10][10];        //Matrix Size Declaration
         
         System.out.println("Enter the elements of the matrix: ");
         for(int i=0;i<m;i++)    //Matrix Initialization
         {
            for(int j=0;j<n;j++)
            {
                 arr[i][j]=sc.nextInt();
            }
         }
         
         System.out.println("The elements in the original matrix are: ");
         for(int i=0;i<m;i++)     //Print the matrix
         {
             for(int j=0;j<n;j++)
             {
                  System.out.print(arr[i][j]+" ");
             }
            System.out.println("");
        }
        
        System.out.println("After transposing the elements are  ");
        for(int i=0;i<m;i++)      
        {
             for(int j=0;j<n;j++)
             {
                 System.out.print(arr[j][i]+" ");
             }
            System.out.println("");
        }
        sc.close();
         
     }
    }
    
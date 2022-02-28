// write a pgm to print diamond pattern 
import java.util.*;
public class Program6{

    public static void main(String[] args){
        int i,j,k;
        
        for(int i=1; i<=5; i++){
            for(j=5; j>1; j--){
                System.out.println(" ");
            }
            for(k=1; k<=(2*i-1); k++){
                System.out.println("*");
            }
            System.out.println("\n");
        }
        for(i=4; i>=1; i--){
            for(j=5; j>1; j--){
                System.out.println(" ");
            }
            for(k=1; k<=(2*i-1); k++){
                System.out.println("*");
            }
            System.out.println("\n");
        }

    }

}
           

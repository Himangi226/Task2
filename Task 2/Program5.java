// make a pgm to calculate permutation n combination of two numbers
import java.util.Scanner;
 
public class Program5
{
    public static int fact(int num){
        int fact=1, i;
        for(i=1; i<=num; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        int n, r;
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter Value of n : ");
        n = sc.nextInt();
        System.out.print("Enter Value of r : ");
        r = sc.nextInt();
 
        System.out.print("NCR is " +(fact(n)/(fact(n-r)*fact(r))));
        System.out.print("\nNPR is " +(fact(n)/(fact(n-r))));
        sc.close();
    }
}
 
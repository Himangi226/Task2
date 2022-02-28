import java.util.*;
public class Program3 {

    public static void main(String[] args){
        
       int fact=1;
        System.out.println("Enter any number- ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        System.out.println("factorial" +fact);
        sc.close();

    }
    
}
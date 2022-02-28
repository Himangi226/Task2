// pgm to remove elements from array list
import java.util.ArrayList;  
  
public class Program9 {  
   public static void main(String[] args) {   
      ArrayList<String> arr = new ArrayList<String>(5);  
      // Adding elements to the ArrayList  
      arr.add("Himi");  
      arr.add("Hittu");  
      arr.add("Avi");  
      arr.add("Mili");  
      System.out.println("The list of the size is: " + arr.size());  
      // Showing all the elements in the ArrayList  
      for (String name : arr) {  
         System.out.println("Name is: " + name);  
      }    
     
      arr.remove(1);  
      System.out.println("\nAfter removing the element the size of the ArrayList is: " + arr.size());  
      // Showing all the elements in the ArrayList  
      for (String name : arr) {  
         System.out.println("Name is: " + name);  
      }  
   }  
}  

// write a pgm to check whether given array is mirror inverse or not 
import java.util.*;
public class Program8 {
    public static void main(String[] args){
        int count=0;
        int arr[]={3,4,5,1,0,2};
        for(int i=0; i<arr.length; i++){
            if(arr[arr[i]]==i){
                count++;
            }
        }
        if(count!=0){
            System.out.println("The given arrayy is mirror inverse");
        } else{
            System.out.println("The given array is not mirror inverse");
        }

    }
}


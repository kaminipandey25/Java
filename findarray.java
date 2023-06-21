//Write a program to find out whether a given integer is present in an array or not.
import java.util.*;
public class Practicepaper{
    public static void main(String args[]){
        int arr[]={3,4,5,6,7,2,9};
        int num=3;
        boolean isInarray=false;
        for(int i=0;i<arr.length;i++){
            if(num==i){
                isInarray=true;
                break;
            }
        }
            
            if(isInarray){
                System.out.print("Element is present in array");
            }else{
                System.out.print("Element is not in array");
            }
        
            
        }
    }

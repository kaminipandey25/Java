//Write a Java program to find the maximum element in an array.
import java.util.*;
public class Practicepaper{
    public static void main(String args[]){
        int [] marks={4,6,66,9,3,2};
        int max=0;
        for(int i:marks){
            if(i>max){
             max=i;
            }
            }
            System.out.print("The maximum number is"+max);
        }
    }

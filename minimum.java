//Write a Java program to find the minimum element in a Java array.

import java.util.*;
public class Practicepaper{
    public static void main(String args[]){
        int[] arr={6,5,4,3,9,2,1};
        int min=arr[0];
        for(int i:arr){
            if(i<min){
                min=i;
            }
        }
        System.out.print("The minimum element is"+" "+ min);

    }
}

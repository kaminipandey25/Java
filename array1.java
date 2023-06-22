//Create a Java program to add two matrices of size 2x3.
import java.util.*;
public class Practicepaper{
    public static void main(String args[]){
        int marks1[] [] ={{4 ,3,5},
                        { 5,6,7}}; 
        int marks2[] []={{4,5,6},
                        {3,8,9}};  
        int result[][]={{ 0,0,0},
                         {0,0,0}};
        for (int i=0;i<marks1.length;i++) {
            for(int j=0;j<marks1[i].length;j++){
                result[i][j]=marks1[i][j]+marks2[i][j];

            }
        }
        for(int i=0;i<=result.length;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }                                            
}
}

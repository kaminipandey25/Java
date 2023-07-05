// TO PRINT STAR PIRAMIND
 import java.util.*;
 public class recursion{
     public static void main(String args[]){
          int n=5;

          for(int numstar=1;numstar<=n;numstar++){
              int numspace=n-numstar;
              for(int i=0;i<numstar;i++){
                  System.out.print("*");
              }
              for(int i=0;i<numspace;i++){
                  System.out.print(" ");
              }
              System.out.println();
          }


     }
  }

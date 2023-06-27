//PRINT X^N(WITH STACK HEIGHT N)

 import java.util.*;
 public class recursion{
    public static int printPower(int x,int n){
         if(n==0){
            return 1;

        }if(n==1){
             return 0;         }
         int x_=printPower(x,n-1);
        int xn=x*x;
         return xn;
     }
    public static void main(String args[]){
         int x=2,n=5;
         int output=printPower(x,n);
         System.out.println(output);
    }
 }

//REVERSE STRING 
 

 import java.util.*;

public class Practicepaper {
     public static void printRev(int idx, String str) {
         if (idx == 0) {
             System.out.print(str.charAt(idx));
             return;
         }
         System.out.print(str.charAt(idx));
        printRev(idx - 1, str);
     }

     public static void main(String args[]) {
         Scanner sc= new Scanner(System.in);
         String str=sc.next();

         printRev(str.length() - 1, str);
     }
 }

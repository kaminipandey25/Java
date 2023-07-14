// REMOVE DUPLICATES IN A STRING

 import java.util.*;
 public class recursion{
     public static boolean[]map=new boolean[26];
     public static void removeDuplicate(String str,int idx,String newstring){
         if(idx==str.length()){
             System.out.println(newstring);
            return;
        }
         char currchar=str.charAt(idx);
         if(map[currchar -'a']){
             removeDuplicate(str,idx+1,newstring);

         }else{
             newstring +=currchar;
             map[currchar-'a']=true;
             removeDuplicate(str,idx+1,newstring);
         }
    
     }
     public static void main(String args[]){
         String str="aabcdfgg";
         removeDuplicate(str,0,"");
     }
 }

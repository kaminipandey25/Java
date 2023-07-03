// first and last occurance of element

import java.util.*;
public class Practicepaper{
    public static int first=-1;
    public static int last=-1;
    public static void firstLastoccurance(String str,int idx,char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);

        }
        char currentchar=str.charAt(idx);
        if(currentchar==element){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        firstLastoccurance(str,idx+1,element);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        firstLastoccurance(str,0,'a');
    }
}

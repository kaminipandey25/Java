//TOWER OF HANOI

import java.util.*;
public class Practicepaper{
    public static void towerOfHanaoi(int n,String src,String help,String dest ){
        if(n==1){
            System.out.println("Transfer disk "+ n +"from "+src+" to "+dest );
            return;
        }
        towerOfHanaoi(n-1,src,dest,help);
        System.out.println("Transfer disk" +n+"from "+src+" to "+dest );
        towerOfHanaoi(n-1,help,src,dest);
    }
    public static void main(String args[]){
        int n=3;
        towerOfHanaoi(n,"source","helper","destination");
    }
}



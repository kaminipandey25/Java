//Write a Java program to find whether an array is sorted or not
public class Practicepaper{
    public static void main(String args[]){
        int [] arr={1,2,3,4,5,6};
        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
            if(isSorted){
            System.out.print("Array is sorted");
            }else{
                System.out.print("Array is not sorted");
            }
        
    }
}

//MERGE SORT....

public class Practicepaper{
    public static void merge(int arr[],int left,int mid,int right){
        int n1=left-mid+1;
        int n2=right-mid;
        int[] leftArray=new int[n1];
        int[] rightArray=new int[n2];
        for(int i=0;i<n1;i++){
            leftArray[i]=arr[left+i];
        }
        for(int j=0;j<n2;j++){
            rightArray[j]=arr[mid+1+j];
        }
        int i=0,j=0;
        int k=left;
        while(i<n1 && j<n2){
            if(leftArray[i] < rightArray[j]){
                arr[k]=leftArray[i];
                i++;

            }else{
                arr[k]=rightArray[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=leftArray[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=rightArray[j];
            j++;
            k++;
        }
    }
        public static void mergesort(int arr[],int left,int right){
            if(left<right){
                int mid=(left+right)/2;
                mergesort(arr,left,mid);
                mergesort(arr,mid+1,right);
                merge(arr,left,mid,right);
            }
        }
        public static void printArray(int[] arr){
            for(int num :arr){
                System.out.print(num +" ");
            }
            System.out.println();
        }
        public static void main(String args[]){
            int arr[]={4,5,3,7,8,9};
            int n=arr.length;
            printArray(arr);
            mergesort(arr,0,n-1);
            printArray(arr);
        }

        

    }

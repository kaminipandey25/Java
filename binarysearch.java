// BINARY SEARCH


 import java.util.*;

public class Practicepaper {
    public static int binarySearch(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;

         while (left <= right) {
             int mid = left + (right - left) / 2;

             if (arr[mid] == target) {
                 return mid;
            }

            if (arr[mid] < target) {
                 left = mid + 1;
             } else {
                 right = mid - 1;
             }
         }

         return -1;
     }

     public static void main(String args[]) {
         int arr[] = { 3, 4, 5,6,7,9 };
         int target = 6;
         int result = binarySearch(arr, target);
        
    
     if (result == -1) {
             System.out.print("Element not found");
         } else {
             System.out.print("Element found at index " + result);
         }
    }
}


// public class Practicepaper {
//     public static int binarySearch(int arr[], int target) {
//         int left = 0;
//         int right = arr.length - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             // Check if the target is present at the middle position
//             if (arr[mid] == target) {
//                 return mid;
//             }

//             // If the target is greater, ignore the left half
//             if (arr[mid] < target) {
//                 left = mid + 1;
//             }
//             // If the target is smaller, ignore the right half
//             else {
//                 right = mid - 1;
//             }
//         }

//         // Target element is not present in the array
//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
//         int target = 23;
//         int result = binarySearch(arr, target);

//         if (result == -1) {
//             System.out.println("Element not found");
//         } else {
//             System.out.println("Element found at index " + result);
//         }
//     }
// }


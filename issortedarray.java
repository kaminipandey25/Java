// ARRAY IS SORTED

import java.util.Scanner;

public class Practicepaper {
    public static boolean isSorted(int idx, int arr[]) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] > arr[idx + 1]) {
            return false;
        } else {
            return isSorted(idx + 1, arr);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(isSorted(0, arr));
    }
}

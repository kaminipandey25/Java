// NUMBER OF WAYS IN WHICH YOU CAN INVITE N PEOPLE IN A PARTY SINGLY OR DOUBLY
 import java.util.*;

 public class recursion {
     public static int inviteGuest(int n) {
        if (n == 1) {
            return 1;
         }
        int way1 = inviteGuest(n - 1);
       int way2 = (n - 1) * inviteGuest(n - 2);
         return way1 + way2;
     }

     public static void main(String args[]) {
        int n = 4;
        int ans = inviteGuest(n);
        System.out.println(ans);
     }
}

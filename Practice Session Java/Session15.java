// Bitwise Operators in Java
// import java.util.*;
// public class Session15 {
//     //And  Operator
//      //0 & 0 =0
//     //0 & 1 =0
//     //1 & 0 =0
//     //1 & 1 =1


//     // Or Operator
//     //0 | 0 =0
//     //0 | 1 =1
//     //1 | 0 =1
//     //1 | 1 =1





//     // Same no XOR with same no gives 0

// // Leetcode Problem 126 :Single Number
//     class Solution {
//     public int singleNumber(int[] nums) {
//         int uniqueNumber = 0;


//         for (int index=0; index<nums.length; index++){
//             uniqueNumber = uniqueNumber ^ nums[index];
//         }
//         return uniqueNumber;

        
//     }
// }
// }







//To find the kth bit
// import java.util.*;
// public class Session15 {
//     public  static boolean getKthbit(int n, int k){
//         int mask = 1<<k;
//         int ans = n & mask;
//         if (ans == 0){
//             return false;
//         }
//         else{
//             return true;
//         }
        
        
        
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         System.out.println(getKthbit(n, k));
//     }
// }







// To set the kth bit
// import java.util.*;
// public class Session15 {
//     public  static int setBit(int n, int k){
//         int mask = 1<<k;
//         int ans = n | mask;
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         System.out.println(setBit(n, k));
        
//     }
// }









// // To Toggle the kth bit
// import java.util.*;
// public class Session15{
//     public static int toogleBit(int n, int k){
//         int mask = 1<<k;
//         int ans = n ^ mask;
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         int k  = sc.nextInt();
//         System.out.println(toogleBit(n, k));

        
//     }
// }








// To Unset the Kth Bit 
import java.util.*;
public class Session15{
    public static int unsetBit(int n, int k){
        int mask = ~(1<<k);
        int ans = n & mask;
        return ans;
    }
    public static void main(String[] args) {

        
    }
}
// Recursion Basics
// Print numbers from n to 1 and from 1 to n using recursion
// import java.util.*;
// public class RecursionBasics1 {
//     public static void printDec(int n) {
//         if(n == 1) {
//             System.out.println(n);
//             return;
//         }
//         System.out.println(n);
//         printDec(n - 1);

        
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         printDec(n);

        
//     }
    
// }







// // Print numbers from 1 to n using recursion
// import java.util.*;
// public class RecursionBasics1 {
//     public static void main(String[] args) {
//         int n = 10;
//         printInc(n);
        
//     }
//  public static void printInc(int n) {
//         if(n==1){
//             System.out.println(n);
//             return;
//         }
//         printInc(n - 1); //the difference is here only we change the order of print and function call
//         System.out.println(n);
//         }
//     }








// // Factorial using Recursion
// import java.util.*;
// public class RecursionBasics1 {
//     public static int factorial(int n) {
//         if(n==0){ // Base case 
//             return 1;

//         }
//         int fnm1 = factorial(n - 1);  //fnm1 = factorial of n-1
//         int fn =n*factorial(n - 1); // fn = n * fn-1
//         return fn;
        
//         }
//     public static void main(String[] args) {
//         int n = 5;
//         factorial(n);
//         System.out.println(factorial(n));
        
//     }
// }





//// Print Nth Fibonacci Number using Recursion
// import java.util.*;
// public class RecursionBasics1 {
//     public static int fibonacci(int n) {
//         if(n==0){ // Base case 
//             return 0;

//         }
//         if(n==1){
//             return 1;       
//             }
//             int fnm1 = fibonacci(n-1);
//             int fnm2 = fibonacci(n-2);
//             int fn = fnm1 + fnm2;
//             return fn;
//         }
//         public static void main(String[] args) {
//             int n = 6;
//             System.out.println(fibonacci(n));
            
//         }
//     }








//// Check if an array is sorted using Recursion
// import java.util.*;
// public class RecursionBasics1 {
//     public static boolean isSorted(int arr[], int i) { // i is the starting index
//         if(i == arr.length - 1) { // base case
//             return true;
//         }
//         if(arr[i]>arr[i+1]){
//             return false;
//         }
//         return isSorted(arr, i+1);
//     }
            
        

//     public static void main(String[] args) {
//         int arr[]={1,2,3,2,5};
//         System.out.println(isSorted(arr,0)); // we start checking from index 0
        
//     }
// }









////To find the first occurrence of an element in an array using Recursion
//  import java.util.*;
//  public class RecursionBasics1 {
//     public static int firstOccurance(int arr[], int key ,int i ){
//         if(arr[i]==key){
//             return i;
//         }
//         if(i==arr.length-1){
//             return -1;
//         }
//         return firstOccurance(arr, key, i+1);
//     }
        
//     public static void main(String[] args) {
//         int arr[]={2,3,5,6,8,3,9};
//         int key=3;
//         System.out.println(firstOccurance(arr,key,0));

        
//     }
// }







//// To find the last occurrence of an element in an array using 
import java.util.*;
public class RecursionBasics1 {
    public static int lastOccurance(int arr[], int key ,int i ){
        if(i==0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        
        return lastOccurance(arr, key, i-1);
    }
        
    public static void main(String[] args) {
        int arr[]={2,2,2};
        int key=2;
        System.out.println(lastOccurance(arr,key,arr.length-1));

        
    }
}






// // To find the power of a number using Recursion
// import java.util.*;
// public class RecursionBasics1 {
//     public static int power(int x, int n) {
//         if(n==0){// Base case
//             return 1;
//         }
//         // int xnm1 = power(x, n - 1);
//         // int xn = x * xnm1;
//         // return xn;
//         return x*power(x, n - 1); // more optimized way of writing
        
//     }
//     public static void main(String[] args) {
//         int x = 2;
//         int n = 5;
//         System.out.println(power(x, n));
        
//     }
// }






// To find the power of a number using Optimized Recursion
// import java.util.*;
// public class RecursionBasics1 {
//     public static int powerOpt(int x, int n) { // 0(log n) time complexity
//         if(n==0){// Base case
//             return 1;
//         }
//         int halfPower = powerOpt(x, n/2);
//         int halfPowerSquared = halfPower * halfPower;
        
//         if(n%2 != 0){ // if n is odd
//             halfPowerSquared = x * halfPowerSquared;
//         }
//         return halfPowerSquared;
//     }

        
//     public static void main(String[] args) {
//         int x = 2;
//         int n = 5;
//         System.out.println(powerOpt(x, n));
        
//     }
// }